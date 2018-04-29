package com.ptteng.controller;

import com.ptteng.domain.business.Product;
import com.ptteng.utlis.MockUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/b")
public class InvestController {

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

    //产品列表
    @RequestMapping(value = "/products")
    public String getBannerList(Model model){
        model.addAttribute("products", MockUtils.getMockDomainPage(Product.class));
        model.addAttribute("count", MockUtils.COUNT);
        return "products";
    }


}
