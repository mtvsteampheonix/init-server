package com.px.init.match.model.service;


import com.px.init.match.model.dto.PersonalApplyList;

import java.util.List;

public interface MatchService {
    List<PersonalApplyList> selectPersonalApplyList(int memberCode);
}
