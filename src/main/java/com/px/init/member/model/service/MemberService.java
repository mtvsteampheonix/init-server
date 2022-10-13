package com.px.init.member.model.service;

import com.px.init.member.model.dto.DefaultMemberDTO;
import com.px.init.member.model.dto.TokenDTO;
import com.px.init.member.model.dto.request.PasswordRequestDTO;
import com.px.init.member.model.dto.request.UpdatePersonalRequestDTO;

/**
 * <pre>
 * Class : MemberService
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-09 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */

public interface MemberService {
    DefaultMemberDTO findMember();
    TokenDTO updateMember(UpdatePersonalRequestDTO personalMemberDTO);
    boolean patchPassword(PasswordRequestDTO passwordPatchInfo);
    boolean deleteMember(String memberPw);
}
