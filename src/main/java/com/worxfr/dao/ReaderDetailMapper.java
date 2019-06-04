package com.worxfr.dao;

import com.worxfr.pojo.ReaderDetail;

public interface ReaderDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ReaderDetail record);

    int insertSelective(ReaderDetail record);

    ReaderDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ReaderDetail record);

    int updateByPrimaryKey(ReaderDetail record);
}