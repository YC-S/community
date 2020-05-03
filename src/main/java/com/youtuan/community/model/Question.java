/*
 * YouTuan Inc.
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.youtuan.community.model;

import lombok.Data;

/**
 * @author shiyuanchen
 * @created 2020/04/26
 * @project community
 */
@Data
public class Question {

    private int id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private int creator;
    private int viewCount;
    private int commentCount;
    private int likeCount;
}
