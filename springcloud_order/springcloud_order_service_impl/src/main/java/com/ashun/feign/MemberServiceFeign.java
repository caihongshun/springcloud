package com.ashun.feign;

import com.ashun.fallBack.MemberServiceFallback;
import com.ashun.service.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @className: MemberServiceFeign
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:16
 **/
@FeignClient(value = "ashun-member",fallback = MemberServiceFallback.class)
public interface MemberServiceFeign extends MemberService {
}
