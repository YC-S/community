/*
 * YouTuan Inc.
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.youtuan.community.mapper;

import com.youtuan.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author shiyuanchen
 */
@Mapper
public interface UserMapper {

    /**
     * 添加user
     */
    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified) values (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);

    /**
     * 寻找session里面的token
     *
     * @return User
     */
    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
