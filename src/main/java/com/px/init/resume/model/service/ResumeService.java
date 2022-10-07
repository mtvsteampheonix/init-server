package com.px.init.resume.model.service;

import com.px.init.resume.model.dao.ResumeMapper;
import com.px.init.resume.model.dto.CareerDTO;
import com.px.init.resume.model.dto.ResumeDTO;
import com.px.init.resume.model.dto.SchoolDTO;
import com.px.init.resume.model.dto.TotalResumeDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type Resume service.
 */
@Service
public class ResumeService {

    private final ResumeMapper mapper;

    /**
     * Instantiates a new Resume service.
     *
     * @param mapper the mapper
     */
    public ResumeService(ResumeMapper mapper){
        this.mapper = mapper;
    }

    /**
     * Regist resume int.
     *
     * @param resume the resume
     * @return the int
     * @throws Exception the exception
     */
    @Transactional
    public int registResume(TotalResumeDTO resume) throws Exception {

        ResumeDTO mainInfo = new ResumeDTO(
                resume.getResumeCode(),
                resume.getTitle(),
                resume.getName(),
                resume.getGender(),
                resume.getBirthday(),
                resume.getZipCode(),
                resume.getAddress(),
                resume.getHousePhone(),
                resume.getMobilePhone(),
                resume.getEmail(),
                resume.getIsOpenedPicture(),
                resume.getImageCode(),
                resume.getMemberCode()
        );

        List<SchoolDTO> schoolInfoList = resume.getSchoolInfoList();
        List<CareerDTO> careerInfoList = resume.getCareerInfoList();
        System.out.println("schoolInfoList = " + schoolInfoList);
        System.out.println("careerInfoList = " + careerInfoList);

        int mainResult = mapper.registMainResume(mainInfo);
//        for(SchoolDTO schoolInfo : schoolInfoList){
//            int schoolResult = mapper.registSchoolResume(schoolInfo);
//            if(schoolResult <= 0){
//                throw new Exception();
//            }
//        }
        for(CareerDTO careerInfo : careerInfoList){
            int careerResult = mapper.registCareerResume(careerInfo);
            if(careerResult <= 0){
                throw new Exception();
            }
        }

//        if(mainResult <= 0 || schoolResult <=0 ){
//            throw new Exception();
//        }

        return 1;
    }
}
