package com.px.init.admin.model.service;

import com.px.init.admin.model.dto.IsActiveDTO;
import com.px.init.email.controller.EmailController;
import com.px.init.exception.updateException;
import com.px.init.member.model.dao.MemberMapper;
import com.px.init.member.model.dto.CompanyMemberDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <pre>
 * Class : AdminServiceImpl
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-12 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */
@Service
public class AdminServiceImpl implements AdminService {

    private static final Logger log = LoggerFactory.getLogger(EmailController.class);
    private MemberMapper memberMapper;

    public AdminServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public List<CompanyMemberDTO> findSignupPlzList() {
        log.info("[AdminService] findSignupPlzList START =====================");

        List<CompanyMemberDTO> companyMemberList = memberMapper.selectSignupList();
        log.info("[AdminService] findSignupPlzList {}", companyMemberList);

        log.info("[AdminService] findSignupPlzList END =====================");

        return companyMemberList;
    }

    @Override
    public CompanyMemberDTO findSignupPlzListByMemberCodePk(int memberCodeFk) {
        log.info("[AdminService] findSignupPlzListByMemberCodePk START =====================");
        CompanyMemberDTO companyMemberDTO = memberMapper.selectSignupByMemberCodePk(memberCodeFk);
        log.info("[AdminService] companyMemberDTO {}", companyMemberDTO);

        log.info("[AdminService] findSignupPlzListByMemberCodePk END =====================");
        return companyMemberDTO;
    }

    @Override
    public boolean putCompanyMemberIsActive(IsActiveDTO isActive) {
        log.info("[AdminService] putCompanyMemberIsActive START =====================");
        log.info("[AdminService] memberCodePk {}", isActive.getMemberCodePk());
        log.info("[AdminService] isActive {}", isActive.getIsActive());
        int result = memberMapper.updateEntMemberIsActive(isActive);
        log.info("[AdminService] result {}", result);
        if (result < 0) {
            log.info("[AdminService] 기업 회원 승인여부 수정 실패");
            throw new updateException("기업 회원 승인여부 수정 실패");
        }
        log.info("[AdminService] putCompanyMemberIsActive END =====================");
        return false;
    }
}
