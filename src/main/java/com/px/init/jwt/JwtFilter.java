package com.px.init.jwt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.px.init.exception.dto.ApiExceptionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * The type Jwt filter.
 */
public class JwtFilter extends OncePerRequestFilter {

    private static final Logger log = LoggerFactory.getLogger(OncePerRequestFilter.class);

    /**
     * The constant AUTHORIZATION_HEADER.
     */
    public static final String AUTHORIZATION_HEADER = "Authorization";
    /**
     * The constant BEARER_PREFIX.
     */
    public static final String BEARER_PREFIX = "Bearer ";

    private final JwtTokenProvider jwtTokenProvider;


    /**
     * Instantiates a new Jwt filter.
     *
     * @param jwtTokenProvider the jwt token provider
     */
    public JwtFilter(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("[JwtFilter] doFilterInternal START ===================================");
        try {
            // 1. Request Header 에서 토큰을 꺼냄
            String jwt = resolveToken(request);
            log.info("[JwtFilter] jwt : {}", jwt);

            // 2. validateToken 으로 토큰 유효성 검사
            // 정상 토큰이면 해당 토큰으로 Authentication 을 가져와서 SecurityContext 에 저장
            if (StringUtils.hasText(jwt) && jwtTokenProvider.validateToken(jwt)) {
                Authentication authentication = jwtTokenProvider.getAuthentication(jwt);
                
                log.info("[JwtFilter] authentication {}", authentication);
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
            log.info("[JwtFilter] doFilterInternal END ===================================");
            filterChain.doFilter(request, response);
        } catch (RuntimeException e) {
            log.info("[JwtFilter] 잘못된 토큰 !!");
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");

            ApiExceptionDTO errorResponse = new ApiExceptionDTO(HttpStatus.UNAUTHORIZED, e.getMessage());
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            log.info("[JwtFilter] doFilterInternal ERROR ===================================");
            response.getWriter().write(convertObjectToJson(errorResponse));
        }
    }

    private String convertObjectToJson(Object object) throws JsonProcessingException {
        if (object == null) {
            return null;
        }
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);

    }

    private String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader(AUTHORIZATION_HEADER);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(BEARER_PREFIX)) {
            return bearerToken.substring(7);
        }
        return null;
    }
}
