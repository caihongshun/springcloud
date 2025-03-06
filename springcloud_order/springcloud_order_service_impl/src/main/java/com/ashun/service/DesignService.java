package com.ashun.service;

import com.ashun.base.ResponseBase;
import com.ashun.vo.GetPriceVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: OrderService
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:11
 **/
public interface DesignService {

    public ResponseBase stageQuery(GetPriceVo getPriceVo);
}
