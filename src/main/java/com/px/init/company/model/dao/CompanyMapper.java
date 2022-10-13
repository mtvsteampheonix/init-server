package com.px.init.company.model.dao;

import com.px.init.company.model.dto.CompanyDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * <pre>
 * Class : CompanyMapper
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-12 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 * @see 참고할 class나 외부 url
 */

@Mapper
public interface CompanyMapper {
    CompanyDTO selectCompanyByRegsitNumber(int registNumber);

    int insertCompany(CompanyDTO insertCompany);

    int getCompanyNextSeq();

}
