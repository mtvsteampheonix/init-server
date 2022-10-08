package com.px.init.match.model.service;


import com.px.init.match.model.dto.PersonalApplyDetailDTO;
import com.px.init.match.model.dto.PersonalApplyListDTO;
import com.px.init.match.model.dto.PersonalSuggestionListDTO;
import com.px.init.match.model.dto.RequestListDTO;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<PersonalApplyListDTO> selectPersonalApplyList(RequestListDTO requestListDTO);

    PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map);

    List<PersonalSuggestionListDTO> selectSuggestionList(RequestListDTO requestListDTO);
}
