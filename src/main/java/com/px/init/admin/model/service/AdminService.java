package com.px.init.admin.model.service;

import com.px.init.admin.model.dto.IsActiveDTO;
import com.px.init.member.model.dto.CompanyMemberDTO;

import java.util.List;

/**
 * <pre>
 * Class : AdminService
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-12 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */

public interface AdminService {
    List<CompanyMemberDTO> findSignupPlzList();

    CompanyMemberDTO findSignupPlzListByMemberCodePk(int memberCodePk);

    boolean putCompanyMemberIsActive(IsActiveDTO IsActiveDTO);
}
