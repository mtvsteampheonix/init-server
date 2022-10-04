package com.px.init.match.model.dao;

import com.px.init.match.model.dto.PersonalApplyListDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MatchMapper {
    List<PersonalApplyListDTO> selectPersonalApplyList(int memberCode);
}
