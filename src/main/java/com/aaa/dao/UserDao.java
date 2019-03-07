package com.aaa.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * fileName:UserDao
 * description:
 * author:zz
 * createTime:2019-03-02 16:34
 */
@Mapper
public interface UserDao {
    @Select("select * from tb_user")
    List<Map<String,Object>> getUser();
}
