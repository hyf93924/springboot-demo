/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yif.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 游客入口
 *
 * @author heyif
 * @since v1.0 2018-11-05T19:58
 */
@RestController
@RequestMapping("/guest")
public class GuestController {

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public String login(){
        return "欢迎进入，您的身份是游客";
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public String getMessage(){
        return "您拥有获得该接口的信息的权限！";
    }

}
