package com.ashun.service.impl;

import com.ashun.base.BaseApiService;
import com.ashun.base.GoogleAuthenticator;
import com.ashun.base.ResponseBase;
import com.ashun.service.GoogleAuthenticatorApi;
import com.ashun.service.GoogleAuthenticatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: OrderServiceImpl
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:12
 **/
@RestController
@Slf4j
public class GoogleAuthenticatorServiceImpl extends BaseApiService implements GoogleAuthenticatorService {


    @Override
    public ResponseBase authIfTrue(String key) {
        ResponseBase res = new ResponseBase();

        //校验
        Boolean isTrue = GoogleAuthenticator.authCode(key, "43I2SJGVZYNHZMY6");
        res.setRtnCode(isTrue ? 1 : 0);
        res.setMsg(isTrue ? "验证成功!" : "验证码输入错误!");

        return res;
    }

}
