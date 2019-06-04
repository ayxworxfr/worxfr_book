package com.worxfr.dao;

import com.worxfr.pojo.BookChapterDetail;

public interface BookChapterDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(BookChapterDetail record);

    int insertSelective(BookChapterDetail record);

    BookChapterDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookChapterDetail record);

    int updateByPrimaryKeyWithBLOBs(BookChapterDetail record);

    int updateByPrimaryKey(BookChapterDetail record);
}