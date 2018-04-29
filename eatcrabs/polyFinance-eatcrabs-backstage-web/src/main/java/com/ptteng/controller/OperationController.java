package com.ptteng.controller;

import com.ptteng.domain.Banner;
import com.ptteng.utils.MockUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OperationController {

    @RequestMapping(value = "/a/banner/list")
    public String getBannerList(Model model){
        model.addAttribute("banners",MockUtils.getMockDomainPage(Banner.class));
        model.addAttribute("count",MockUtils.COUNT);
        return "bannerList";
    }

}
