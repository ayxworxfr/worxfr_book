package com.worxfr.dao;

import com.worxfr.pojo.PermissionDetail;

public interface PermissionDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionDetail record);

    int insertSelective(PermissionDetail record);

    PermissionDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionDetail record);

    int updateByPrimaryKey(PermissionDetail record);
}