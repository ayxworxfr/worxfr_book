package com.worxfr.dao;

import com.worxfr.pojo.BookChapter;

public interface BookChapterMapper {
    int deleteByPrimaryKey(String id);

    int insert(BookChapter record);

    int insertSelective(BookChapter record);

    BookChapter selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BookChapter record);

    int updateByPrimaryKey(BookChapter record);
}