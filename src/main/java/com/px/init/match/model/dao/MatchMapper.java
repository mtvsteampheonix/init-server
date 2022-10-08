package com.px.init.match.model.dao;

import com.px.init.match.model.dto.PersonalApplyDetailDTO;
import com.px.init.match.model.dto.PersonalApplyListDTO;
import com.px.init.match.model.dto.PersonalSuggestionListDTO;
import com.px.init.match.model.dto.RequestListDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MatchMapper {
    List<PersonalApplyListDTO> selectPersonalApplyList(RequestListDTO requestListDTO);

    PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map);

    List<PersonalSuggestionListDTO> selectSuggestionList(RequestListDTO requestListDTO);
}
