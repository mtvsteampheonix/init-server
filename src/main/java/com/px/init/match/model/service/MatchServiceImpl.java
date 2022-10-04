package com.px.init.match.model.service;

import com.px.init.match.model.dao.MatchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {

    private MatchMapper mapper;

    @Autowired
    public MatchServiceImpl(MatchMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public Object selectPersonalApplyList(int memberCode) {
        return mapper.selectPersonalApplyList(memberCode);
    }
}
