package com.ashun.service;

import com.ashun.base.ResponseBase;
import com.ashun.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @className: MemberService
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 14:16
 **/
public interface MemberService {

    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name") String name);

    @RequestMapping("/getUserInfo")
    public ResponseBase getUserInfo();
}
