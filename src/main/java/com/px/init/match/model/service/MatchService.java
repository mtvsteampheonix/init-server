package com.px.init.match.model.service;


import com.px.init.match.model.dto.PersonalApplyListDTO;

import java.util.List;

public interface MatchService {
    List<PersonalApplyListDTO> selectPersonalApplyList(int memberCode);
}
