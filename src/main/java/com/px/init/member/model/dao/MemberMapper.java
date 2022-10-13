package com.px.init.member.model.dao;

import com.px.init.member.model.dto.CompanyMemberDTO;
import com.px.init.member.model.dto.EntMemberDTO;
import com.px.init.member.model.dto.MemberDTO;
import com.px.init.member.model.dto.DefaultMemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <pre>
 * Class : MemberMapper
 * Comment : 마이바티스 사용을 위한 Member mapper
 * History
 * 2022-10-05 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see /resources/mybatis/MemberMapper.xml
 */
@Mapper
public interface MemberMapper {
    /**
     * Select member by email member dto.
     *
     * @param email the email
     * @return the member dto
     */
    MemberDTO selectMemberByEmail(String email);

    /**
     * Insert personal member int.
     *
     * @param personalFormData the personal form data
     * @return the int
     */
    int insertPersonalMember(DefaultMemberDTO personalFormData);

    /**
     * Select member by member id member dto.
     *
     * @param memberId the member id
     * @return the member dto
     */
    MemberDTO selectMemberByMemberId(String memberId);

    /**
     * Update personal member int.
     *
     * @param updateMember the update member
     * @return the int
     */
    int updatePersonalMember(DefaultMemberDTO updateMember);

    /**
     * Update password int.
     *
     * @param patchMember the patch member
     * @return the int
     */
    int updatePassword(DefaultMemberDTO patchMember);

    /**
     * Delete member int.
     *
     * @param memberCodePk the member code pk
     * @return the int
     */
    int deleteMember(int memberCodePk);

    /**
     * Insert company member int.
     *
     * @param companyFormData the company form data
     * @return the int
     */
    int insertCompanyMember(CompanyMemberDTO companyFormData);

    EntMemberDTO selectEntMemberByMemberCodeFk(int memberCodePk);

    List<CompanyMemberDTO> selectSignupList();

    int putCompanyMember(EntMemberDTO entMember);

    int getMemberNextSeq();

    CompanyMemberDTO selectSignupByMemberCodePk(int memberCodePk);

    int updateEntMemberIsActive(int memberCodeFk);

    int setMemberPwTemp(MemberDTO member);
}
