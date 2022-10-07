package com.px.init.match.model.service;

import com.px.init.match.model.dao.MatchMapper;
import com.px.init.match.model.dto.PersonalApplyDetailDTO;
import com.px.init.match.model.dto.PersonalApplyListDTO;
import com.px.init.match.model.dto.RequestPersonalApplyListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MatchServiceImpl implements MatchService {

    private MatchMapper mapper;

    @Autowired
    public MatchServiceImpl(MatchMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public List<PersonalApplyListDTO> selectPersonalApplyList(RequestPersonalApplyListDTO requestPersonalApplyListDTO) {
        return mapper.selectPersonalApplyList(requestPersonalApplyListDTO);
    }

    @Override
    public List<PersonalApplyDetailDTO> selectPersonalApplyDetail(Map<String, Integer> map) {
        return mapper.selectPersonalApplyDetail(map);
    }
}
