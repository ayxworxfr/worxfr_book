package com.worxfr.dao;

import com.worxfr.pojo.AuthorLevel;

public interface AuthorLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthorLevel record);

    int insertSelective(AuthorLevel record);

    AuthorLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuthorLevel record);

    int updateByPrimaryKey(AuthorLevel record);
}