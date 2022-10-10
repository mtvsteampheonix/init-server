package com.px.init.jwt;

import com.px.init.exception.TokenException;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.MemberRoleDTO;
import com.px.init.member.model.dto.TokenDTO;
import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.*;
import java.util.stream.Collectors;

/**
 * The type Jwt token provider.
 */
@Component
public class JwtTokenProvider{
    private static final Logger log = LoggerFactory.getLogger(JwtTokenProvider.class);
    private static final String AUTHORITIES_KEY = "auths";
    private static final String MEMBER_CODE = "memberCode";
    private static final String MEMBER_NAME = "memberName";
    private static final String BEARER_TYPE = "bearer";
    private static final long ACCESS_TOKEN_EXPIRE_TIME = 1000 * 60 * 10 * 6; // 10분

    private final UserDetailsService userDetailsService;

    private final Key key;

    /**
     * Instantiates a new Jwt token provider.
     *
     * @param userDetailsService the user details service
     * @param secretkey          the secretkey
     */
    public JwtTokenProvider(UserDetailsService userDetailsService,@Value("${jwt.secretKey}") String secretkey) {
        this.userDetailsService = userDetailsService;
        byte[] keyBytes = Decoders.BASE64.decode(secretkey);
        this.key = Keys.hmacShaKeyFor(keyBytes);
    }

    /**
     * Generate token dto token dto.
     *
     * @param member the member
     * @return the token dto
     */
    public TokenDTO generateTokenDTO(MemberDTO member){
        log.info("[TokenProvider] generateTokenDTO START ===================================");
        log.info("[TokenProvider] {}", member.getMemberRole());


        // 권한 가져오기
        List<MemberRoleDTO> memberRoleList = member.getMemberRole();

        List<String> roles = new ArrayList<>();
        memberRoleList.forEach(memberRoleDTO -> roles.add(memberRoleDTO.getAuthority().getAuthorityName()));

        Claims claims = Jwts.claims().setSubject(member.getMemberId());
        claims.put(AUTHORITIES_KEY, roles.get(0));
        claims.put(MEMBER_CODE, member.getMemberCodePk());
        claims.put(MEMBER_NAME, member.getMemberName());

        long now = (new Date()).getTime();
        //Access Token 생성
        Date accessTokenExpiresIn = new Date(now + ACCESS_TOKEN_EXPIRE_TIME);
        String accessToken = Jwts.builder()
                .setClaims(claims)
                .setExpiration(accessTokenExpiresIn)
                .signWith(key, SignatureAlgorithm.HS512)
                .compact();

        return new TokenDTO(BEARER_TYPE, member.getMemberName(), accessToken, accessTokenExpiresIn.getTime());
    }

    /**
     * Get user id string.
     *
     * @param accessToken the access token
     * @return the string
     */
    public String getUserId(String accessToken){
        return Jwts
                .parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(accessToken)
                .getBody()
                .getSubject();
    }

    /**
     * Gets authentication.
     *
     * @param accessToken the access token
     * @return the authentication
     */
    public Authentication getAuthentication(String accessToken) {
        Claims claims = parseClaims(accessToken);
        if (claims.get(AUTHORITIES_KEY) == null) {
            throw new RuntimeException("권한 정보가 없는 토큰입니다.");
        }

        // 클레임에서 권한 정보 가져오기
        Collection<? extends GrantedAuthority> authorities =
                Arrays.stream(claims.get(AUTHORITIES_KEY).toString().split(","))
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList());
        log.info("[TokenProvider] authorities : {}", authorities);

        UserDetails userDetails = userDetailsService.loadUserByUsername(this.getUserId(accessToken));

        return new UsernamePasswordAuthenticationToken(userDetails, "", userDetails.getAuthorities());
    }

    /**
     * Validate token boolean.
     *
     * @param token the token
     * @return the boolean
     */
    public boolean validateToken(String token){
        try{
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) {
            log.info("[TokenProvider] 잘못된 JWT 서명입니다.");
            throw new TokenException("잘못된 JWT 서명입니다.");
        } catch (ExpiredJwtException e) {
            log.info("[TokenProvider] 만료된 JWT 토큰입니다.");
            throw new TokenException("만료된 JWT 토큰입니다.");
        } catch (UnsupportedJwtException e) {
            log.info("[TokenProvider] 지원되지 않는 JWT 토큰입니다.");
            throw new TokenException("지원되지 않는 JWT 토큰입니다.");
        } catch (IllegalArgumentException e) {
            log.info("[TokenProvider] JWT 토큰이 잘못되었습니다.");
            throw new TokenException("JWT 토큰이 잘못되었습니다.");
        }
    }

    private Claims parseClaims(String accessToken){
        try {
            return Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(accessToken).getBody();
        } catch (ExpiredJwtException e){
            return e.getClaims();
        }
    }

}
