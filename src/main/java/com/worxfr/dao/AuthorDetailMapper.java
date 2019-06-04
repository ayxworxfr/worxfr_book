package com.worxfr.dao;

import com.worxfr.pojo.AuthorDetail;

public interface AuthorDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuthorDetail record);

    int insertSelective(AuthorDetail record);

    AuthorDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuthorDetail record);

    int updateByPrimaryKey(AuthorDetail record);
}