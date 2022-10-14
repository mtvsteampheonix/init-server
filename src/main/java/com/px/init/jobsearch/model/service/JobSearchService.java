package com.px.init.jobsearch.model.service;

import com.px.init.common.dto.ResponseDTO;
import com.px.init.jobsearch.model.dao.JobSearchMapper;
import com.px.init.jobsearch.model.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Job search service.
 */
@Service
public class JobSearchService {

    private final JobSearchMapper jobSearchMapper;

    /**
     * Instantiates a new Job search service.
     *
     * @param jobSearchMapper mapper파일
     */
    public JobSearchService(JobSearchMapper jobSearchMapper){
        this.jobSearchMapper = jobSearchMapper;
    }

    /**
     * Select job search list list.
     *
     * @param search 검색기능에 입력한 값이, 구직공고 이름이나, 기업명이 있을 경우 보여주기 위한 파라미터
     * @return 조회한 구직공고 목록을 반환합니다.
     */
    public List<JobSearchListDTO> selectJobSearchList(String search) {

        List<JobSearchListDTO> jobSearchListDTOList = jobSearchMapper.selectJobSearchList(search);

        return jobSearchListDTOList;
    }


    /**
     * Select job search details by code job search details dto.
     *
     * @param noticecode
     * @return 구직공고의 상세 내용을 반환합니다.
     */
    public JobSearchDetailsDTO selectJobSearchDetailsByCode(int noticecode) {
        return jobSearchMapper.selectJobSearchDetailsByCode(noticecode);
    }

    public List<JobSearchListDTO> selectMyJobSearchList(int memberCodePk) {
        int companyCodeFk = jobSearchMapper.selectCompanyCodeFkByMemberCodePk(memberCodePk);
        System.out.println("memberCodePk : "+companyCodeFk);

        List<JobSearchListDTO> jobMySearchListDTOList = jobSearchMapper.selectMyJobSearchList(companyCodeFk);

        return jobMySearchListDTOList;
    }

    @Transactional
    public String insertJobSearch(RegistJobSearchDTO registJobSearchDTO, int memberCodePk) {
        String response = "구직공고 작성 실패";
        List<String> selfIntroList = registJobSearchDTO.getSelfIntroList();

        int companyCodeFk = jobSearchMapper.selectCompanyCodeFkByMemberCodePk(memberCodePk);
        System.out.println("memberCodePk : "+companyCodeFk);

        Map<String,Object> insertMap = new HashMap<String,Object>();
        insertMap.put("registJobSearchDTO",registJobSearchDTO);
        insertMap.put("companyCodeFk",companyCodeFk);

        int result1 = jobSearchMapper.insertJobSearch(insertMap);
//        int result1 = jobSearchMapper.insertJobSearch(registJobSearchDTO, companyCodeFk);
        int noticeCode = registJobSearchDTO.getNoticeCodePk();
        System.out.println("seq값을 제데로 출력하는지 확인 : " +noticeCode);
        System.out.println(selfIntroList);
        int result2 = 0;
        Map<String,Object> map = new HashMap<String,Object>();
        /*작업중*/
        map.put("noticeCode",noticeCode);
        for(String selfIntro : selfIntroList){
            map.put("selfIntro", selfIntro);
            result2 += jobSearchMapper.insertJobSearchSelfIntro(map);
        }
//        int result2 = jobSearchMapper.insertJobSearchSelfIntro(selfIntroList);

        if(result1 > 0 && result2 >0){
            response="구직공고 작성 성공";
        }

        return response;
    }


    public int deleteJobSearch(List<Integer> noticeCodeList) {

        int result = 0;
        for (int noticeCode: noticeCodeList)
        {
            System.out.println(noticeCode);
            result += jobSearchMapper.deleteJobSearch(noticeCode);
        }

        return result;
    }


    /*왜 안돼는지*/
    public EditJobSearchDTO selectEditJobSearch(int noticeCode) {

        return jobSearchMapper.selectEditJobSearch(noticeCode);
    }


    public String updatePostJobSearch(PostDTO postDTO) {
        int result = jobSearchMapper.updatePostJobSearch(postDTO);

        String response = "게시성공";

        if(result <= 0 )
            response = "게시 실패";

        return response;
    }
}
