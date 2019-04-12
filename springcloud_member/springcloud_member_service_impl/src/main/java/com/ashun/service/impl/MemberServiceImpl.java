package com.ashun.service.impl;

import com.ashun.base.BaseApiService;
import com.ashun.base.ResponseBase;
import com.ashun.entity.UserEntity;
import com.ashun.service.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: MemberServiceImpl
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 14:27
 **/
@RestController
@RefreshScope
public class MemberServiceImpl extends BaseApiService implements MemberService {
    @Value("${server.port}")
    private String serverPort;

   @Value("${ashun}")
   private String ashun;

    @RequestMapping("/ashun")
    public String ashunInfo() {
        return ashun;
    }


    @Override
    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name")String name) {
        UserEntity UserEntity=new UserEntity();
        UserEntity.setName("我是member会员服务" + serverPort);
        UserEntity.setAge(20);
        return UserEntity;
    }

    @Override
    public ResponseBase getUserInfo() {
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return setResultSuccess();
    }
}
