package com.cookie.mybatis.mapper;

import com.cookie.mybatis.model.Suborder;

public interface SuborderMapper {
    int deleteByPrimaryKey(String suborderId);

    int insert(Suborder record);

    int insertSelective(Suborder record);

    Suborder selectByPrimaryKey(String suborderId);

    int updateByPrimaryKeySelective(Suborder record);

    int updateByPrimaryKey(Suborder record);
}