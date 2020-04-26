/*
 * YouTuan Inc.
 * Copyright (c) 2019-2020 All Rights Reserved.
 */

package com.youtuan.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shiyuanchen
 */
@Controller
public class PublishController {

    @GetMapping("/publish")
    public String publsh() {
        return "publish";
    }
}
