/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.yif.controller;

import com.yif.tools.JsonResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员
 *
 * @author heyif
 * @since v1.0 2018-11-05T20:11
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getMessage(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setResult(null);
        jsonResult.setStatus("您拥有管理员权限，可以获得该接口的信息！");
        return ResponseEntity.ok(jsonResult);
    }

}
