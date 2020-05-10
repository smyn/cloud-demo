package com.tuanzi.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者：caopengfei
 * @时间：2020/5/10
 */
@RestController
public class UserController {

    @RequestMapping("userInfo")
    public String userInterface(){
        return "访问成功";
    }
}
