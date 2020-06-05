package com.cookie.mybatis.mapper;

import com.cookie.mybatis.model.Runoob;

public interface RunoobMapper {
    int deleteByPrimaryKey(Integer runoobId);

    int insert(Runoob record);

    int insertSelective(Runoob record);

    Runoob selectByPrimaryKey(Integer runoobId);

    int updateByPrimaryKeySelective(Runoob record);

    int updateByPrimaryKey(Runoob record);
}