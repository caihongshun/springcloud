package com.ashun.design.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @ClassName: VipStrategy
 * @Description:
 * @Author: caihongshun
 * @Date: 2024/3/19 15:00
 */
@Component
public class VipStrategy implements CalculateStrategy{

    @Override
    public String userLevel() {
        return "vip";
    }

    @Override
    public BigDecimal discount(BigDecimal originalPrice) {
        return originalPrice.multiply(new BigDecimal("0.9"));
    }

}
