package com.cookie.mybatis.mapper;

import com.cookie.mybatis.model.Travelinfo;

public interface TravelinfoMapper {
    int deleteByPrimaryKey(String travelInfoId);

    int insert(Travelinfo record);

    int insertSelective(Travelinfo record);

    Travelinfo selectByPrimaryKey(String travelInfoId);

    int updateByPrimaryKeySelective(Travelinfo record);

    int updateByPrimaryKey(Travelinfo record);
}