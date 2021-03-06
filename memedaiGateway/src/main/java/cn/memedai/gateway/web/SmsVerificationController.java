package cn.memedai.gateway.web;

import cn.memedai.gateway.service.SmsVerificationCodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by dell on 14-7-15.
 */
@Controller(value = "smsVerificationController")
@RequestMapping("/sms")
public class SmsVerificationController {
    @Inject
    private SmsVerificationCodeService smsVerificationCodeService;

    @RequestMapping(value = "/{mobilePhone}", method = RequestMethod.GET)
    @ResponseBody
    public boolean sendVerificationCode(@PathVariable String mobilePhone) {
        return smsVerificationCodeService.sendVerificationCode(mobilePhone);
    }

    @RequestMapping(value = "/{mobilePhone}/{code}", method = RequestMethod.POST)
    @ResponseBody
    public boolean verifyCode(@PathVariable String mobilePhone, @PathVariable String code) {
        return smsVerificationCodeService.verifyCode(mobilePhone, code);
    }
}
