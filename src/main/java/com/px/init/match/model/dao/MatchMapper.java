package com.px.init.match.model.dao;

import com.px.init.match.model.dto.PersonalApplyDetailDTO;
import com.px.init.match.model.dto.PersonalApplyListDTO;
import com.px.init.match.model.dto.RequestPersonalApplyListDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MatchMapper {
    List<PersonalApplyListDTO> selectPersonalApplyList(RequestPersonalApplyListDTO requestPersonalApplyListDTO);

    List<PersonalApplyDetailDTO> selectPersonalApplyDetail(Map<String, Integer> map);
}
