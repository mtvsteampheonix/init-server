package com.px.init.resume.model.dao;

import com.px.init.resume.model.dto.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper {
    int registMainResume(ResumeDTO mainInfo);

    int registSchoolResume(SchoolDTO schoolInfo);

    int registCareerResume(CareerDTO careerInfo);

    int registCoreActivityResume(CoreActivityDTO coreActivityInfo);

    int registExternalResume(ExternalDTO externalInfo);

    int registForeignLanguageResume(ForeignLanguageDTO foreignLanguageInfo);

    int registTrainingResume(TrainingDTO trainingInfo);

    int registQualificationResume(QualificationDTO qualificationInfo);

    int registSkillResume(SkillStackDTO skillCode);

    int registDesiredJobResume(DesiredJobDTO desiredJobCode);

    List<SkillStackDTO> findSkillList();

    List<DesiredJobDTO> findDesiredJobList();

    List<ForeignLanguageTestDTO> findForeignTestList();

    List<QualificationDivDTO> findQualificationList();

    List<ResumeCodeAndTitleDTO> findResumeCode(int memberCode);

    TotalResumeDTO findResumeDetail(int resumeCode);

    int deleteResume(int resumeCode);
}
