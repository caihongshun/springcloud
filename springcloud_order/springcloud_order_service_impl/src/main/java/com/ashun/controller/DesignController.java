package com.ashun.controller;

import com.ashun.base.ResponseBase;
import com.ashun.base.util.JsonUtils;
import com.ashun.design.strategy.SaleService;
import com.ashun.vo.GetPriceVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @ClassName: DesignController
 * @Description:
 * @Author: caihongshun
 * @Date: 2025/3/6 13:51
 */

@RestController
@Slf4j
public class DesignController {

    @Autowired
    private SaleService saleService;

    @RequestMapping("/design/strategy")
    public ResponseBase stageQuery(@Validated @RequestBody GetPriceVo getPriceVo) {
        log.info("人参:{}" + JsonUtils.toJson(getPriceVo));
        BigDecimal actualPricewithstrategy = saleService.getActualPricewithstrategy(getPriceVo.getLevel(), getPriceVo.getOrgPrice());
        ResponseBase responseBase = new ResponseBase();
        responseBase.setData(actualPricewithstrategy);
        return responseBase;
    }
}
