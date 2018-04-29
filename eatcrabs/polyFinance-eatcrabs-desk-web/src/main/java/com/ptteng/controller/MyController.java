package com.ptteng.controller;

import com.ptteng.domain.business.Mail;
import com.ptteng.utlis.MockUtils;
import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/b")
public class MyController {

    //续投确认
    @RequestMapping(value = "/transaction/{orderId}", method = RequestMethod.POST)
    public String transactionOriderId(String mobile, String orderId, String password, String vCode){
        return "transactionOriderId";
    }

    //我的理财
    @RequestMapping(value = "/transaction", method = RequestMethod.POST)
    public String transaction(String mobile){
        return "transcation";
    }

    //交易记录
    @RequestMapping(value = "/transaction/records", method = RequestMethod.POST)
    public String records(String mobile){
        return "recodes";
    }

    //银行卡管理-解绑银行卡
    @RequestMapping(value = "/bank/card", method = RequestMethod.DELETE)
    public String cardDelete(String mobile, String password, String cCode, String bandCardId){
        return "cardDelete";
    }

    //设置交易密码
    @RequestMapping(value = "/bank/depository", method = RequestMethod.POST)
    public String depository(String mobile, String password, String vCode){
        return "depository";
    }

    //添加银行卡-验证
    @RequestMapping(value = "/bank/card", method = RequestMethod.PUT)
    public String verifyCard(String mobile, String vCode){
        return "verifyCard";
    }

    //输入银行卡号
    @RequestMapping(value = "/bank/card/num", method = RequestMethod.POST)
    public String bankCardNum(String moblie, String bankCardNum){
        return "bankCardNum";
    }

    //添加银行卡主页
    @RequestMapping(value = "/bank/card", method = RequestMethod.GET)
    public String bankCard(String mobile){
        return "bankCard";
    }

    //银行卡管理页面
    @RequestMapping(value = "/manage/bank/card", method = RequestMethod.GET)
    public String manageCard(String mobile){
        return "manageCard";
    }

    //删除消息
    @RequestMapping(value = "/my/msgs/{msgId}", method = RequestMethod.GET)
    public String msgs(String mobile, String msgId){
        return "msg";
    }

    //我的消息
    @RequestMapping(value = "/my/msgs", method = RequestMethod.GET)
    public String msgs(String mobile, Model model){
        model.addAttribute("msgs", MockUtils.getMockDomainPage(Mail.class));
        model.addAttribute("count", MockUtils.COUNT);
        return "msgs";
    }

    //账户安全-登陆密码修改
    @RequestMapping(value = "/lpwd", method = RequestMethod.POST)
    public String uepdateLPwd(String oldLPwd, String newPwd){
        return "uepdateLPwd";
    }

    //修改交易密码
    @RequestMapping(value = "/tpwd", method = RequestMethod.PUT)
    public String updateTPwd(String mobile, String password){
        return "updateTPwd";
    }

    //找回交易密码
}
