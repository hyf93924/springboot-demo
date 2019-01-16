/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yif.controller;

import com.yif.entity.User;
import com.yif.service.UserService;
import com.yif.tools.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 登录用户
 *
 * @author heyif
 * @since v1.0 2018-10-30T19:29
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public String getMessage(){
        return "您拥有用户权限，可以获得该接口的信息！";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserList(){
        JsonResult r = new JsonResult();
        try {
            List<User> list = userService.getUserList();
            r.setResult(list);
            r.setStatus("success");
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }
}
