package com.ptteng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/b")
public class indexController {

    //首页-主页
    @RequestMapping(value = "/u/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }
}
