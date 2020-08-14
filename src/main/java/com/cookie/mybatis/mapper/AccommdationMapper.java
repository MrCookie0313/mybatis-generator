package com.cookie.mybatis.mapper;

import com.cookie.mybatis.model.Accommdation;

public interface AccommdationMapper {
    int deleteByPrimaryKey(String accommodationId);

    int insert(Accommdation record);

    int insertSelective(Accommdation record);

    Accommdation selectByPrimaryKey(String accommodationId);

    int updateByPrimaryKeySelective(Accommdation record);

    int updateByPrimaryKey(Accommdation record);
}