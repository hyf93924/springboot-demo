/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yif.controller;

import com.yif.entity.TestUser;
import com.yif.tools.ResponseAsJson;
import org.springframework.web.bind.annotation.*;

/**
 * @author heyif
 * @since v1.0 2018-12-18T16:46
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/getTestUser", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    @ResponseBody
    public ResponseAsJson<TestUser> login(){
        TestUser user = new TestUser();
        user.setName("曾小怂");
        user.setSex("女");
        return new ResponseAsJson<>(null, user);
    }

}
