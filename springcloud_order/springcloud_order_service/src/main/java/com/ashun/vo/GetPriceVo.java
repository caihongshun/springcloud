package com.ashun.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @ClassName: GetPriceVo
 * @Description:
 * @Author: caihongshun
 * @Date: 2024/3/21 14:38
 */
@Data
public class GetPriceVo {

    private String level;
    private BigDecimal orgPrice;


}
