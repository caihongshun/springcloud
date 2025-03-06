package com.ashun.service;

import com.ashun.base.ResponseBase;
import com.ashun.vo.DeliveryRowVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: OrderService
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:11
 **/
public interface DeliveryService {
    /**
     * @Author: caihongshun
     * @Date: 15:12 2019/3/20
     * @Param:
     * @return:
     * @Description:
     **/
    @RequestMapping("/delivery/query")
    public ResponseBase deliveryQuery(String name);

    /**
     * @Author: caihongshun
     * @Date: 15:12 2019/3/20
     * @Param:
     * @return:
     * @Description:
     **/
    @RequestMapping("/delivery/row/query")
    public ResponseBase deliveryRowQuery(@RequestBody DeliveryRowVo DeliveryRowVo);
}
