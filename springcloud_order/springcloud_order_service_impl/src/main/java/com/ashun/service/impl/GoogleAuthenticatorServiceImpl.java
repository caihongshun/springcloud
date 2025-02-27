package com.ashun.service.impl;

import com.ashun.base.BaseApiService;
import com.ashun.base.GoogleAuthenticator;
import com.ashun.base.ResponseBase;
import com.ashun.base.util.JsonUtils;
import com.ashun.design.strategy.SaleService;
import com.ashun.service.DesignService;
import com.ashun.service.GoogleAuthenticatorService;
import com.ashun.vo.GetPriceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

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
        Boolean isTrue = GoogleAuthenticator.authcode(key, "43I2SJGVZYNHZMY6");
        res.setRtnCode(isTrue ? 1 : 0);
        res.setMsg(isTrue ? "验证成功!" : "验证吗输入错误!");

        return res;
    }
}
