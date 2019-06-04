package com.worxfr.dao;

import com.worxfr.pojo.ReadLevel;

public interface ReadLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReadLevel record);

    int insertSelective(ReadLevel record);

    ReadLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReadLevel record);

    int updateByPrimaryKey(ReadLevel record);
}