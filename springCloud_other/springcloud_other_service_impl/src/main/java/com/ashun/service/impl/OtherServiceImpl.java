package com.ashun.service.impl;

import com.ashun.base.BaseApiService;
import com.ashun.base.ResponseBase;
import com.ashun.service.OtherService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: DeliveryServiceImpl
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:12
 **/
@RestController
public class OtherServiceImpl extends BaseApiService implements OtherService {


    @Override
    public ResponseBase test(String name) {
        return this.setResultSuccess(name);
    }
}
