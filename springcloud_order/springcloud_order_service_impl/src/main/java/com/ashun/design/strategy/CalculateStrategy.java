package com.ashun.design.strategy;

import java.math.BigDecimal;

/**
 * @ClassName: CalculateStrategy
 * @Description:
 * @Author: caihongshun
 * @Date: 2024/3/19 14:43
 */
public interface CalculateStrategy {

    String userLevel();

    BigDecimal discount(BigDecimal originalPrice);
}
