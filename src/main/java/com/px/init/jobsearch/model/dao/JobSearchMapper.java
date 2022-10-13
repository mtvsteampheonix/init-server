package com.px.init.jobsearch.model.dao;/*
 * <pre>
 * Class : JobSearchMapper
 * Comment : 어떤 클래스인지 간단한 설명
 * History
 * 2022-10-06(최재혁) 처음 작성
 * </pre>
 * @version 1.0
 * @author 최재혁
 * @see 참고할 class나 외부 url
 *
 */

import com.px.init.jobsearch.model.dto.EditJobSearchDTO;
import com.px.init.jobsearch.model.dto.JobSearchDetailsDTO;
import com.px.init.jobsearch.model.dto.JobSearchListDTO;
import com.px.init.jobsearch.model.dto.RegistJobSearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public  interface JobSearchMapper {

    List<JobSearchListDTO> selectJobSearchList(String search);

    JobSearchDetailsDTO selectJobSearchDetailsByCode(int noticecode);

    int insertJobSearch(Map insertMap);

    int insertJobSearchSelfIntro(Map map);

    int selectCompanyCodeFkByMemberCodePk(int memberCodePk);

    List<JobSearchListDTO> selectMyJobSearchList(int companyCodeFk);

    int deleteJobSearch(int noticeCode);

    EditJobSearchDTO selectEditJobSearch(int noticeCode);
}
