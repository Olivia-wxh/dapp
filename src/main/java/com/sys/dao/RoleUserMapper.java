package com.sys.dao;

import com.sys.entity.RoleUserKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoleUserMapper {
    int deleteByPrimaryKey(RoleUserKey key);

    int insert(RoleUserKey record);

    int insertSelective(RoleUserKey record);
}