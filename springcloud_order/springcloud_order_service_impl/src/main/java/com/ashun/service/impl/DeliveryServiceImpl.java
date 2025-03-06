package com.ashun.service.impl;

import com.ashun.base.BaseApiService;
import com.ashun.base.ResponseBase;
import com.ashun.myBatis.mapper.DeliveryMapper;
import com.ashun.myBatis.mapper.DeliveryRowMapper;
import com.ashun.myBatis.pojo.Delivery;
import com.ashun.myBatis.pojo.DeliveryRow;
import com.ashun.service.DeliveryApi;
import com.ashun.service.DeliveryService;
import com.ashun.vo.DeliveryRowVo;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: DeliveryServiceImpl
 * @description:
 * @author: caihongshun
 * @create: 2019-03-20 15:12
 **/
@RestController
public class DeliveryServiceImpl extends BaseApiService implements DeliveryService {


    @Autowired
    private DeliveryMapper deliveryMapper;

    @Autowired
    private DeliveryRowMapper deliveryRowMapper;

    @Override
    @RequestMapping("/delivery/query")
    @Transactional
    public ResponseBase deliveryQuery(String name) {

        ResponseBase res = new ResponseBase();

        List<Delivery> users = deliveryMapper.selectList(null);

        res.setData(users);

        return res;
    }

    @Override
    @RequestMapping("/delivery/row/query")
    @Transactional
    public ResponseBase deliveryRowQuery(@RequestBody DeliveryRowVo deliveryRowVo) {

        ResponseBase res = new ResponseBase();

        // 创建分页对象 当前页，每页数据数
        Page<DeliveryRow> page = new Page<>(deliveryRowVo.getPage(), deliveryRowVo.getSize());
        LambdaQueryWrapper<DeliveryRow> queryWrapper = new LambdaQueryWrapper<>();

        if(StringUtils.hasText(deliveryRowVo.getQuerySkuName())){
            queryWrapper.like(DeliveryRow::getSkuName,deliveryRowVo.getQuerySkuName());
        }
        Page<DeliveryRow> deliveryRowPage = deliveryRowMapper.selectPage(page, queryWrapper);

        // 获取查询结果
        List<DeliveryRow> list = deliveryRowPage.getRecords();
        long total = deliveryRowPage.getTotal();
        long pages = deliveryRowPage.getPages();
        // 输出查询结果
        System.out.println("总条数：" + total);
        res.setData(deliveryRowPage);

        return res;
    }

}
