package com.px.init.match.model.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MatchMapper {
    Object selectPersonalApplyList(int memberCode);
}
