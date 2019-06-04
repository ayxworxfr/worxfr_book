package com.worxfr.dao;

import com.worxfr.pojo.Impermission;

public interface ImpermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Impermission record);

    int insertSelective(Impermission record);

    Impermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Impermission record);

    int updateByPrimaryKey(Impermission record);
}