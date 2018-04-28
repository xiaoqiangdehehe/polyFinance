package com.ptteng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/b")
public class loginController {

    //登陆
    @RequestMapping(value = "/u/login", method = RequestMethod.POST)
    public String login(String mobile, String password) {
        return "login";
    }

    //注册（找回密码）-获取验证码
    @RequestMapping(value = "/u/vcode", method = RequestMethod.GET)
    public String getVCode(String mobile, String type) {
        return "vcode";
    }

    //注册
    @RequestMapping(value = "/u/register", method = RequestMethod.POST)
    public String register(String mobile, String vCode, String password) {
        return "register";
    }

    //找回密码-验证验证码
    @RequestMapping(value = "/u/verify/vcode", method = RequestMethod.POST)
    public String verifyCode(String mobile, String vCode) {
        return "verifyCode";
    }

    //更新密码
    @RequestMapping(value = "/pwd", method = RequestMethod.PUT)
    public String updatePwd(String mobile, String password) {
        return "updatePwd";
    }

    //手势密码登陆
    @RequestMapping(value = "/login/gpwd", method = RequestMethod.POST)
    public String loginGpwd(String mobile, String password) {
        return "logingpwd";
    }
}
