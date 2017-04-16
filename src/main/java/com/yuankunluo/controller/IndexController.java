package com.yuankunluo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yuank on 2017-04-16.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello World Index";
    }

    @RequestMapping("/profile/{userId}")
    @ResponseBody
    public String profile(@PathVariable("userId") int userId){
        return "profile:" +  userId;
    }
}
