package com.px.init.resume.model.service;

import com.px.init.member.model.dto.MemberDTO;
import com.px.init.resume.model.dao.ResumeMapper;
import com.px.init.resume.model.dto.*;
import com.px.init.util.FileUploadUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

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

    @Value("${image.image-dir}")
    private String IMAGE_DIR;
    @Value("${image.image-url}")
    private String IMAGE_URL;

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

        List<SkillStackDTO> skillInfoList = resume.getSkillInfoList();
        List<DesiredJobDTO> desiredJobInfoList = resume.getDesiredJobInfoList();
        List<SchoolDTO> schoolInfoList = resume.getSchoolInfoList();
        List<CareerDTO> careerInfoList = resume.getCareerInfoList();
        List<CoreActivityDTO> coreActivityInfoList = resume.getCoreActivityInfoList();
        List<ExternalDTO> externalInfoList = resume.getExternalInfoList();
        List<ForeignLanguageDTO> foreignLanguageInfoList = resume.getForeignLanguageInfoList();
        List<TrainingDTO> trainingInfoList = resume.getTrainingInfoList();
        List<QualificationDTO> qualificationInfoList = resume.getQualificationInfoList();

        String imageName = UUID.randomUUID().toString().replace("-", "");
        String replaceFileName = null;
        int result = 0;

        try {
            replaceFileName = FileUploadUtils.saveFile(IMAGE_DIR, imageName, resume.getImgUrl());

            resume.setProductImageUrl(replaceFileName);

            System.out.println("replaceFileName = " + replaceFileName);

            int mainResult = mapper.registMainResume(mainInfo);

        } catch (IOException e) {
            FileUploadUtils.deleteFile(IMAGE_DIR, replaceFileName);
            throw new RuntimeException(e);
        }


        System.out.println("desiredJobInfoList = " + desiredJobInfoList);
        System.out.println("skillInfoList = " + skillInfoList);
        System.out.println("schoolInfoList = " + schoolInfoList);
        System.out.println("careerInfoList = " + careerInfoList);
        System.out.println("coreActivityInfoList = " + coreActivityInfoList);
        System.out.println("externalInfoList = " + externalInfoList);
        System.out.println("foreignLanguageInfoList = " + foreignLanguageInfoList);
        System.out.println("trainingInfoList = " + trainingInfoList);
        System.out.println("qualificationInfoList = " + qualificationInfoList);


        // 기술 스택
        for(SkillStackDTO skillCode : skillInfoList){
            int skillResult = mapper.registSkillResume(skillCode);
            if(skillResult <= 0 ){
                throw new Exception();
            }
        }

        for(DesiredJobDTO desiredJobCode : desiredJobInfoList){
            int desiredResult = mapper.registDesiredJobResume(desiredJobCode);
            if(desiredResult <= 0 ){
                throw new Exception();
            }
        }

        for(SchoolDTO schoolInfo : schoolInfoList){
            int schoolResult = mapper.registSchoolResume(schoolInfo);
            if(schoolResult <= 0){
                throw new Exception();
            }
        }
        for(CareerDTO careerInfo : careerInfoList){
            int careerResult = mapper.registCareerResume(careerInfo);
            if(careerResult <= 0){
                throw new Exception();
            }
        }
        for(CoreActivityDTO coreActivityInfo : coreActivityInfoList){
            int coreActivityResult = mapper.registCoreActivityResume(coreActivityInfo);
            if(coreActivityResult <= 0) {
                throw new Exception();
            }
        }
        for(ExternalDTO externalInfo : externalInfoList){
            int externalResult = mapper.registExternalResume(externalInfo);
            if(externalResult <= 0) {
                throw new Exception();
            }
        }
        for(ForeignLanguageDTO foreignLanguageInfo : foreignLanguageInfoList){
            int foreignLanguageResult = mapper.registForeignLanguageResume(foreignLanguageInfo);
            if(foreignLanguageResult <= 0) {
                throw new Exception();
            }
        }
        for(TrainingDTO trainingInfo : trainingInfoList){
            int trainingResult = mapper.registTrainingResume(trainingInfo);
            if(trainingResult <= 0) {
                throw new Exception();
            }
        }
        for(QualificationDTO qualificationInfo : qualificationInfoList){
            int qualificationResult = mapper.registQualificationResume(qualificationInfo);
            if(qualificationResult <= 0) {
                throw new Exception();
            }
        }

        return 1;
    }

    public List<SkillStackDTO> findSkillList() {

        return mapper.findSkillList();
    }

    public List<DesiredJobDTO> findDesiredJobList() {
        return mapper.findDesiredJobList();
    }

    public List<ForeignLanguageTestDTO> findForeignTestList() {
        return mapper.findForeignTestList();
    }

    public List<QualificationDivDTO> findQualificationList() {
        return mapper.findQualificationList();
    }

    public List<ResumeCodeAndTitleDTO> findResumeCode(int memberCode) {
        return mapper.findResumeCode(memberCode);
    }

    public TotalResumeDTO findResumeDetail(int resumeCode) {
        return mapper.findResumeDetail(resumeCode);
    }

    public int deleteResume(int resumeCode) {
        return mapper.deleteResume(resumeCode);
    }

    public int updateResume(TotalResumeDTO resume, int resumeCode) throws Exception {
        ResumeDTO mainInfo = new ResumeDTO(
                resumeCode,
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

        List<SkillStackDTO> skillInfoList = resume.getSkillInfoList();
        List<DesiredJobDTO> desiredJobInfoList = resume.getDesiredJobInfoList();
        List<SchoolDTO> schoolInfoList = resume.getSchoolInfoList();
        List<CareerDTO> careerInfoList = resume.getCareerInfoList();
        List<CoreActivityDTO> coreActivityInfoList = resume.getCoreActivityInfoList();
        List<ExternalDTO> externalInfoList = resume.getExternalInfoList();
        List<ForeignLanguageDTO> foreignLanguageInfoList = resume.getForeignLanguageInfoList();
        List<TrainingDTO> trainingInfoList = resume.getTrainingInfoList();
        List<QualificationDTO> qualificationInfoList = resume.getQualificationInfoList();

        System.out.println("desiredJobInfoList = " + desiredJobInfoList);
        System.out.println("skillInfoList = " + skillInfoList);
        System.out.println("schoolInfoList = " + schoolInfoList);
        System.out.println("careerInfoList = " + careerInfoList);
        System.out.println("coreActivityInfoList = " + coreActivityInfoList);
        System.out.println("externalInfoList = " + externalInfoList);
        System.out.println("foreignLanguageInfoList = " + foreignLanguageInfoList);
        System.out.println("trainingInfoList = " + trainingInfoList);
        System.out.println("qualificationInfoList = " + qualificationInfoList);

        int mainResult = mapper.updateMainResume(mainInfo);

//        // 기술 스택
//        for(SkillStackDTO skillCode : skillInfoList){
//            int skillResult = mapper.updateSkillResume(skillCode);
//            if(skillResult <= 0 ){
//                throw new Exception();
//            }
//        }
//
//        for(DesiredJobDTO desiredJobCode : desiredJobInfoList){
//            int desiredResult = mapper.updateDesiredJobResume(desiredJobCode);
//            if(desiredResult <= 0 ){
//                throw new Exception();
//            }
//        }
//
//        for(SchoolDTO schoolInfo : schoolInfoList){
//            int schoolResult = mapper.updateSchoolResume(schoolInfo);
//            if(schoolResult <= 0){
//                throw new Exception();
//            }
//        }
//        for(CareerDTO careerInfo : careerInfoList){
//            int careerResult = mapper.updateCareerResume(careerInfo);
//            if(careerResult <= 0){
//                throw new Exception();
//            }
//        }
//        for(CoreActivityDTO coreActivityInfo : coreActivityInfoList){
//            int coreActivityResult = mapper.updateCoreActivityResume(coreActivityInfo);
//            if(coreActivityResult <= 0) {
//                throw new Exception();
//            }
//        }
//        for(ExternalDTO externalInfo : externalInfoList){
//            int externalResult = mapper.updateExternalResume(externalInfo);
//            if(externalResult <= 0) {
//                throw new Exception();
//            }
//        }
//        for(ForeignLanguageDTO foreignLanguageInfo : foreignLanguageInfoList){
//            int foreignLanguageResult = mapper.updateForeignLanguageResume(foreignLanguageInfo);
//            if(foreignLanguageResult <= 0) {
//                throw new Exception();
//            }
//        }
//        for(TrainingDTO trainingInfo : trainingInfoList){
//            int trainingResult = mapper.updateTrainingResume(trainingInfo);
//            if(trainingResult <= 0) {
//                throw new Exception();
//            }
//        }
//        for(QualificationDTO qualificationInfo : qualificationInfoList){
//            int qualificationResult = mapper.updateQualificationResume(qualificationInfo);
//            if(qualificationResult <= 0) {
//                throw new Exception();
//            }
//        }

        return 1;
    }

    public List<MemberDTO> selectResumeList() {
        return mapper.selectResumeList();
    }
}
