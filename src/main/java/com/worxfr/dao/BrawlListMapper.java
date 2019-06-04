package com.worxfr.dao;

import com.worxfr.pojo.BrawlList;

public interface BrawlListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BrawlList record);

    int insertSelective(BrawlList record);

    BrawlList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrawlList record);

    int updateByPrimaryKey(BrawlList record);
}