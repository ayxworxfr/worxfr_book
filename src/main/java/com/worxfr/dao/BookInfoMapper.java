package com.worxfr.dao;

import com.worxfr.pojo.BookInfo;

public interface BookInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(BookInfo record);

    int insertSelective(BookInfo record);

    BookInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookInfo record);

    int updateByPrimaryKeyWithBLOBs(BookInfo record);

    int updateByPrimaryKey(BookInfo record);
}