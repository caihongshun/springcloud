package com.ashun.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName: SimplePageInfo
 * @Description: 分页参数
 * @Author: caihongshun
 * @Date: 2025/1/17 13:53
 */
@Data
public class SimplePageInfo implements Serializable {

    private Integer page = 1;

    private Integer size = 10;

    private Boolean count;
}
