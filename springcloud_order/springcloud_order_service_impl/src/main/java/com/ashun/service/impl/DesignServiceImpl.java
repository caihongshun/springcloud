package com.ashun.service.impl;

import com.ashun.base.BaseApiService;
import com.ashun.base.ResponseBase;
import com.ashun.base.util.JsonUtils;
import com.ashun.design.strategy.SaleService;
import com.ashun.service.DesignService;
import com.ashun.vo.GetPriceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

/**
 * @className: OrderServiceImpl
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:12
 **/
@Service
@Slf4j
public class DesignServiceImpl extends BaseApiService implements DesignService {

    @Autowired
    private SaleService saleService;

    @Override
    public ResponseBase stageQuery(GetPriceVo getPriceVo) {
        log.info("人参:{}" + JsonUtils.toJson(getPriceVo));
        BigDecimal actualPricewithstrategy = saleService.getActualPricewithstrategy(getPriceVo.getLevel(), getPriceVo.getOrgPrice());
        ResponseBase responseBase = new ResponseBase();
        responseBase.setData(actualPricewithstrategy);
        return responseBase;
    }


}
