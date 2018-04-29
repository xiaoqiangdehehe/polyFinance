package com.ptteng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value = "/b")
public class PayController {

    //提交投资金额
    @RequestMapping(value = "/{productId}/iamount", method = RequestMethod.POST)
    public String iamount(String mobile, String iAmount, String productId) {
        return "iamount";
    }

    //获取验证码
    @RequestMapping(value = "/vcode", method = RequestMethod.GET)
    public String vcode(String mobile, String type){
        return "vcode";
    }

    //验证交易
    @RequestMapping(value = "/verify/transaction", method = RequestMethod.POST)
    public String verifyTransaction(String mobile, String password, String vCode){
        return "verifyTransaction";
    }

    //电子签章（提交）
    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public String file(MultipartFile file){
        return "file";
    }
}
