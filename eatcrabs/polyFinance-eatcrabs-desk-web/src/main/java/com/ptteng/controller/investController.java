package com.ptteng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/b")
public class investController {

    //理财-立即投资
    @RequestMapping(value = "/products/{productId}/invest", method = RequestMethod.POST)
    public String invest(String mobile, @PathVariable(name = "productId") String productId) {
        return "invest";
    }

    //项目详情
    @RequestMapping(value = "/products/{productId}/detail")
    public String detail(@PathVariable(name = "productId") String productId){
        return "detail";
    }
}
