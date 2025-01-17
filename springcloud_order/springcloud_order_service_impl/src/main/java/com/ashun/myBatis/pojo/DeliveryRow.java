package com.ashun.myBatis.pojo;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_lc_delivery_row")
public class DeliveryRow {

    private static final long serialVersionUID = 1L;

    // 送货单行编号
    private String rowCode;

    // 三方送货单行号
    private String thirdRowCode;

    // 股份子单号
    private String interRowCode;

    // 送货单号
    private String deliveryCode;

    // 上级供应商编码
    private String supplierCode;

    // 上级供应商名称
    private String supplierName;

    // 上级供应商销售组织编码
    private String supplierOrgCode;

    // 上级供应商销售组织名称
    private String supplierOrgName;

    // 上级供应商编码(自营端查看)
    private String selfSupplierCode;

    // 上级供应商名称(自营端查看)
    private String selfSupplierName;

    // 订单号
    private String orderCode;

    // 订单行号
    private String orderRowCode;

    // 订单类型(10:采购订单,20:销售订单,30:预销售订单)
    private String orderClass;

    // 结算状态(00:待结算 10:部分结算 20:全部结算)
    private String settleStatus;

    // 开票状态(00:待开票 10:部分开票 20:全部开票)
    private String invoiceStatus;

    // 销售订单业务类型(10:直销直送,20:直销库发,30:备库,40:寄售,50:撮合)
    private String bizType;

    // 关联送货单行号（直销直送专用）
    private String reRowCode;

    // 仓库编号
    private String warehouseCode;

    // 仓库名称
    private String warehouseName;

    // 客户经理编码
    private String custManagerCode;

    // 客户经理
    private String custManager;

    // 品类经理编码
    private String classManagerCode;

    // 品类经理
    private String classManager;

    // 销售执行编码
    private String executorCode;

    // 销售执行名称
    private String executor;

    // 销售执行部门信息
    private String executorDepartment;

    // 采购执行编码
    private String prExecutorCode;

    // 采购执行名称
    private String prExecutor;

    // 采购执行部门信息
    private String prExecutorDepartment;

    // 品类开发编码
    private String classDevelopCode;

    // 品类开发
    private String classDevelop;

    // 销售结算编码
    private String settlePersonCode;

    // 销售结算名称
    private String settlePerson;

    // 销售结算部门信息
    private String settleDepartment;

    // 采购结算编码
    private String prSettlePersonCode;

    // 采购结算名称
    private String prSettlePerson;

    // 采购结算部门信息
    private String prSettleDepartment;

    // 欧冶采购执行编码
    private String oyjccgUserCode;

    // 欧冶采购执行名称
    private String oyjccgUserName;

    // 欧采执行部门信息
    private String oyjccgExecutorDepartment;

    // SPUID
    private String spuCode;

    // SKUID
    private String skuCode;

    // SKU名称
    private String skuName;

    // SKU类型(10：普通【单品，系列，搭售】，20：非标，30：组合【SKU组ID】)
    private String skuType;

    // 组合ID 仅组合商品存
    private String skuGroupCode;

    // 组合名称 仅组合商品存
    private String skuGroupName;

    // 买家SKU编码
    private String buyerSkuCode;

    // 采购方订单行号专区使用
    private String buyerRowCode;

    // 采购方计划行号
    private String buyerPlanRowCode;

    // SKU属性
    private Object skuAtt;

    // 商品品类编码
    private String classCode;

    // 商品品类
    private String className;

    // 主图片存储url
    private String mainImgUrl;

    // 品牌编码
    private String brandCode;

    // 品牌
    private String brandName;

    // 货号
    private String articleNo;

    // 型规
    private String typeGauge;

    // 商品单价(含税)
    private java.math.BigDecimal priceTax;

    // 商品单价(未税)
    private java.math.BigDecimal priceNotax;

    // 税率
    private java.math.BigDecimal taxRate;

    // 下单数量（销售单位）
    private java.math.BigDecimal orderNum;

    // 发货量（销售单位）
    private java.math.BigDecimal saleQuantity;

    // 发货量（标准单位）
    private java.math.BigDecimal deliveryNum;

    // 实际发货量（标准单位）
    private java.math.BigDecimal actualDelNum;

    // 实际发货量（销售单位）
    private java.math.BigDecimal actualNumSale;

    // 收货量
    private java.math.BigDecimal receiveNum;

    // 收货量(销售)
    private java.math.BigDecimal receiveNumSale;

    // 结算量
    private java.math.BigDecimal settleNum;

    // 开票量
    private java.math.BigDecimal invoiceNum;

    // 销售单位ID
    private String saleUnit;

    // 销售单位名称
    private String saleUnitName;

    // 基本单位ID
    private String baseUnit;

    // 基本单位名称
    private String baseUnitName;

    // 转换关系比例
    private java.math.BigDecimal saleMeasureCovNum;

    // 商品总金额(含税)
    private java.math.BigDecimal skuAmount;

    // 是否支持修改收货数量( 0 ：否；1： 是）")
    private String ifAdjustReceiptNum;

    // 期望发货日期
    private java.util.Date expectDeliveryDate;

    // 入库详情(入库单号：量)
    private String storageDetails;

    // 收货实际状态(10:待收 20: 实收 30:超收 40:少收)
    private String receiveActualStatus;

    // 状态
    private String status;

    // 备注
    private String remark;

    // 语言类型
    private String langVer;

    // 当前有效状态(1:有效)
    private String aliveFlag;

    // 扩展字段1  ROW_CODE备份
    private String extend1;

    // 扩展字段2  RE_ROW_CODE备份
    private String extend2;

    // 扩展字段3  创建人U代码
    private String extend3;

    // 扩展字段4
    private String extend4;

    // 扩展字段5
    private String extend5;

    // 创建者
    private String createUser;

    // 创建者姓名
    private String createName;

    // 创建时间
    private java.util.Date createDate;

    // 修改者
    private String updateUser;

    // 修改者姓名
    private String updateName;

    // 修改时间
    private java.util.Date updateDate;

    // 版本号
    private Integer version;

}