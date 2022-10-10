package com.px.init.jobsearch.model.service;

import com.px.init.jobsearch.model.dao.JobSearchMapper;
import com.px.init.jobsearch.model.dto.JobSearchDetailsDTO;
import com.px.init.jobsearch.model.dto.JobSearchListDTO;
import com.px.init.jobsearch.model.dto.RegistJobSearchDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Transactional
    public String insertJobSearch(RegistJobSearchDTO registJobSearchDTO) {
        String response = "구직공고 작성 실패";

        List<String> selfIntroList = registJobSearchDTO.getSelfIntroList();
        int result1 = jobSearchMapper.insertJobSearch(registJobSearchDTO);
        int result2 = jobSearchMapper.insertSelfIntro(selfIntroList);

        if(result1 > 0 && result2>0){
            response="구직공고 작성 성공";
        }

        return response;
    }
}
