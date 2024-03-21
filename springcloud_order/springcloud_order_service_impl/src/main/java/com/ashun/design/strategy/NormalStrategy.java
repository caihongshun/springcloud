package com.ashun.design.strategy;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @ClassName: NormalStrategy
 * @Description:
 * @Author: caihongshun
 * @Date: 2024/3/19 14:59
 */
@Component
public class NormalStrategy implements CalculateStrategy{
    @Override
    public String userLevel() {
        return "normal";
    }

    @Override
    public BigDecimal discount(BigDecimal originalPrice) {
        return originalPrice.multiply(new BigDecimal("1.0"));
    }
}
