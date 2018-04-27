package com.ptteng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller

public class HelloController {


    @RequestMapping("/")
    public String helloJsp(Map<String, Object> map) {
        return "helloJsp";
    }

}
