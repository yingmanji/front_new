package com.front.dao;

import com.front.entity.Generate;

public interface GenerateMapper {
    int deleteByPrimaryKey(Long generateId);

    int insert(Generate record);

    int insertSelective(Generate record);

    Generate selectByPrimaryKey(Long generateId);

    int updateByPrimaryKeySelective(Generate record);

    int updateByPrimaryKey(Generate record);
}