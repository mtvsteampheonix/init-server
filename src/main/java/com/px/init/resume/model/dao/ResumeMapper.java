package com.px.init.resume.model.dao;

import com.px.init.resume.model.dto.CareerDTO;
import com.px.init.resume.model.dto.ResumeDTO;
import com.px.init.resume.model.dto.SchoolDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResumeMapper {
    int registMainResume(ResumeDTO mainInfo);

    int registSchoolResume(SchoolDTO schoolInfo);

    int registCareerResume(CareerDTO careerInfo);
}
