package com.ashun.service;

import com.ashun.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: OrderService
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:11
 **/
public interface OtherService {
    /**
     * @Author: caihongshun
     * @Date: 15:12 2019/3/20
     * @Param:  http://localhost:8901/api-other/test?name=wer
     * @return:
     * @Description:
     **/
    @RequestMapping("/test")
    public ResponseBase test(String name);
}
