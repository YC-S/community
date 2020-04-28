/*
 * YouTuan Inc.
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.youtuan.community.mapper;

import com.youtuan.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shiyuanchen
 * @created 2020/04/26
 * @project community
 */
@Mapper
public interface QuestionMapper {

    @Insert("insert into QUESTION (title, description, gmt_create, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tag})")
    void create(Question question);

}
