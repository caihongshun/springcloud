package com.ashun.service;

import com.ashun.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: OrderService
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:11
 **/
public interface GoogleAuthenticatorApi {
    /**
     * @Author: caihongshun
     * @Date: 15:12 2019/3/20
     * @Param:
     * @return:
     * @Description:
     **/
    @RequestMapping("/order/auth/ifTrue")
    public ResponseBase authIfTrue(String key);


}
