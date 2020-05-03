/*
 * YouTuan Inc.
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.youtuan.community.dto;

import lombok.Data;

/**
 * @author shiyuanchen
 */
@Data
public class GithubUser {

    private String name;
    private Long id;
    private String bio;
    private String avatar_url;
}
