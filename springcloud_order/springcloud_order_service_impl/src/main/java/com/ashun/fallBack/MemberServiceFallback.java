package com.ashun.fallBack;

import com.ashun.base.BaseApiService;
import com.ashun.base.ResponseBase;
import com.ashun.entity.UserEntity;
import com.ashun.feign.MemberServiceFeign;
import org.springframework.stereotype.Component;


/**
 * @className: MemberServiceFallBack
 * @description:
 * @author: caihongshun
 * @create: 2019-03-25 11:25
 **/
@Component
public class MemberServiceFallback extends BaseApiService implements MemberServiceFeign {
    @Override
    public UserEntity getMember(String name) {
        return null;
    }

    @Override
    public ResponseBase getUserInfo() {
        return setResultError("对不起");
    }
}
