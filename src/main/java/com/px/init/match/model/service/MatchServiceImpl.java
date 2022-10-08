package com.px.init.match.model.service;

import com.px.init.match.model.dao.MatchMapper;
import com.px.init.match.model.dto.PersonalApplyDetailDTO;
import com.px.init.match.model.dto.PersonalApplyListDTO;
import com.px.init.match.model.dto.PersonalSuggestionListDTO;
import com.px.init.match.model.dto.RequestListDTO;
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
    public List<PersonalApplyListDTO> selectPersonalApplyList(RequestListDTO requestListDTO) {
        return mapper.selectPersonalApplyList(requestListDTO);
    }

    @Override
    public PersonalApplyDetailDTO selectPersonalApplyDetail(Map<String, Integer> map) {
        return mapper.selectPersonalApplyDetail(map);
    }

    @Override
    public List<PersonalSuggestionListDTO> selectSuggestionList(RequestListDTO requestListDTO) {
        return mapper.selectSuggestionList(requestListDTO);
    }
}
