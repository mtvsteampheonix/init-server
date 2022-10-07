package com.px.init.match.model.service;


import com.px.init.match.model.dto.PersonalApplyDetailDTO;
import com.px.init.match.model.dto.PersonalApplyListDTO;
import com.px.init.match.model.dto.RequestPersonalApplyListDTO;

import java.util.List;
import java.util.Map;

public interface MatchService {
    List<PersonalApplyListDTO> selectPersonalApplyList(RequestPersonalApplyListDTO requestPersonalApplyListDTO);

    PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map);
}
