package com.ashun.design.strategy;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: VipStrategy
 * @Description:
 * @Author: caihongshun
 * @Date: 2024/3/19 15:00
 */
@Service
public class SaleService{

    Map<String, CalculateStrategy> map = new HashMap<>();

    public SaleService(List<CalculateStrategy> calculateStrategyList) {
        calculateStrategyList.forEach(calculateStrategy -> map.put(calculateStrategy.userLevel(), calculateStrategy));
    }


    public BigDecimal getActualPricewithstrategy(String level, BigDecimal originalPrice) {
        CalculateStrategy calculatestrategy = map.get(level);
        return calculatestrategy == null ? originalPrice : calculatestrategy.discount(originalPrice);
    }



}
