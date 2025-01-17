package com.ashun.myBatis.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


@Data
@TableName("t_lc_delivery")
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;

    // 送货单号
    private String deliveryCode;

    // 系统别
    private String sysCode;

    // 三方送货单号(专区)
    private String thirdDeliveryCode;

    // 股份编码
    private String interCode;

    // 物流系统物流单号（仓库）
    private String otherDeliveryCode;

    // 京东送货单号(供应商)
    private String jdCode;

    // 京东子订单号
    private String jdOrderCode;

    // 京东父订单号
    private String jdThirdCode;

    // 是否企配(京东专用)
    private String isEntAlloc;

    // 订单来源(10:商城,20:合同,30:专区)
    private String orderSource;

    // 专区ID
    private String zoneCode;

    // 自营编码
    private String selfCode;

    // 买家CODE
    private String buyerCode;

    // 买家名称
    private String buyerName;

    // 买家销售组织编码
    private String buyerOrgCode;

    // 买家销售组织名称
    private String buyerOrgName;

    // 卖家CODE
    private String sellerCode;

    // 卖家名称
    private String sellerName;

    // 卖家销售组织编码'
    private String sellerOrgCode;

    // 卖家销售组织名称
    private String sellerOrgName;

    // 订单创建人
    private String orderCreateUser;

    // 送货类型（10:采购收货单/销售送货单；20:异议送货单; 30:补库收货单 40:退货收货单 41:退供送货单 42:换货送货单 43:补货送货单 ）
    private String deliveryType;

    // 是否为危化品送货单
    private String ifHazchem;

    // 是否存在虚假贸易风险
    private String ifRisk;

    // 买家范围：10：欧冶工业品、11：多元、12：社会
    private String buyerRange;

    // 买家所属部门ID
    private String buyerDeptCode;

    // 买家所属部门名称
    private String buyerDeptName;

    // 订单类型(10:采购订单,20:销售订单,30:预销售订单)
    private String orderClass;

    // 销售订单业务类型(10:直销直送,20:直销库发,30:备库,40:寄售,50:撮合 60:售后入库 61:售后出库）
    private String bizType;

    // 关联送货单号（直销直送专用）
    private String reDeliveryCode;

    // 地址ID
    private String addressId;

    // 收货人姓名
    private String rcvUserName;

    // 收货人手机号码
    private String rcvMobile;

    // 收货省份代码
    private String rcvProvinceCode;

    // 收货城市代码
    private String rcvCityCode;

    // 收货地区代码
    private String rcvRegionCode;

    // 收货街道代码
    private String rcvStreetCode;

    // 收货省份
    private String rcvProvince;

    // 收货城市
    private String rcvCity;

    // 收货地区
    private String rcvRegion;

    // 收货街道
    private String rcvStreet;

    // 收货地址
    private String rcvAddress;

    // 发货公司
    private String sendCompany;

    // 发货人姓名
    private String sendUserName;

    // 发货人手机号码
    private String sendMobile;

    // 发货省份代码
    private String sendProvinceCode;

    // 发货城市代码
    private String sendCityCode;

    // 发货地区代码
    private String sendRegionCode;

    // 发货街道代码
    private String sendStreetCode;

    // 发货省份
    private String sendProvince;

    // 发货城市
    private String sendCity;

    // 发货地区
    private String sendRegion;

    // 发货街道
    private String sendStreet;

    // 发货地址
    private String sendAddress;

    // 预计到货日期
    private Date estimateArriveDate;

    // 发货时间
    private Date sendDate;

    // 妥投时间
    private Date deliverDate;

    // 妥投类型(10:TMS小程序妥投 20:第三方系统妥投 30:面客端妥投 40:执行跟踪妥投 50:快递妥投)
    private String deliverType;

    // 收货时间
    private Date receiveDate;

    // 收货类型(10:妥投后收货 20:客户点击收货 30:执行确认收货 40:第三方系统收货 50:自提收货)
    private String receiveType;

    // 出库时间
    private Date outboundDate;

    // 撤销时间
    private Date cancelDate;

    // 拒收时间
    private Date rejectDate;

    // 发货金额
    private BigDecimal deliverAmount;

    // 收货金额
    private BigDecimal receiveAmount;

    // 是否保价
    private String insuredPrice;

    // 收货操作人 (10: 采购方收货 ; 20 : 运营平台收货)
    private String receiveOperatorCode;

    // 收货操作人名称
    private String receiveOperatorName;

    // 收货方式（10：自动收货；20：人工收货） (10: 以采购方收货为准 20:不以采购方收货为准)
    private String receiveMethod;

    // 发货方式(10:供应商发货 20:客户自提)
    private String deliveryPattern;

    // 物流方式（10：自有车辆；20：快递；30：欧贝物流；40: 委托运输）
    private String logisticsType;

    // 委托合同号;洽谈订单号(欧贝物流)
    private String consignNo;

    // 委托物流类型(10:合同;20 :洽谈)
    private String consignType;

    // 送达方式(10:直送仓库 20:欧贝驿站转送)
    private String deliveryMethod;

    // 外部驿站编码
    private String otherStageCode;

    // 外部驿站名称
    private String otherStageName;

    // 外部驿站服务编码
    private String otherStageOrderCode;

    // 驿站联系人
    private String stageUserName;

    // 驿站联系人手机号码
    private String stageMobile;

    // 驿站委托方(10:欧冶采购 20:供应商)
    private String stageEntrust;

    // 驿站结算方(10:欧冶采购 20:供应商)
    private String stageSettle;

    // 驿站省份代码
    private String stageProvinceCode;

    // 驿站城市代码
    private String stageCityCode;

    // 驿站地区代码
    private String stageRegionCode;

    // 驿站街道代码
    private String stageStreetCode;

    // 驿站省份
    private String stageProvince;

    // 驿站城市
    private String stageCity;

    // 驿站地区
    private String stageRegion;

    // 驿站街道
    private String stageStreet;

    // 驿站详细地址
    private String stageAddress;

    // 是否要求驿站转送(1:是 0:否)
    private String ifRequestStage;

    // 是否备妥
    private String ifReady;

    // 备妥时间
    private Date readyDate;

    // 特殊要求
    private String specialRequest;

    // 收货备注
    private String receiveRemark;

    // 是否可结算
    private String settleFlag;

    // 不可结算原因
    private String settleMsg;

    // 运单审核状态(00:待提交 10:未上传 40:待审核 50:审批驳回 60:审核通过)
    private String waybillReviewStatus;

    // 运单审核驳回意见
    private String waybillReviewReason;

    // 是否免审
    private String waybillInspection;

    // 撤销类型(0:无撤销 1:拒收撤销 2:订单取消撤销)
    private String cancelType;

    // 撤销消息
    private String cancelMsg;

    // 自营催收货次数
    private Integer selfUrgeReceiveQty;

    // 自营催收货最后时间
    private Date selfUrgeReceiveLastDate;

    // 自营催收货最后操作人代码
    private String selfUrgeReceiveLastCode;

    // 自营催收货最后操作人名称
    private String selfUrgeReceiveLastName;

    // 自营催收货原因值集代码
    private String selfUrgeReceiveReasonCode;

    // 自营催收货预计收货时间
    private Date selfUrgeReceiveEstimateTime;

    //是否需要门禁
    private String ifSendAccessControl;

    // 备注
    private String remark;

    // 送货备注(物流展示)
    private String logisticsRemark;

    // 紧急发货备注
    private String urgentRemark;

    // 二方商城外部数据
    private String thirdData;

    // 语言类型
    private String langVer;

    // 状态（10：待发货；20：待收货；30：妥投待确认；40：已收货；50：已撤销; 60: 异议处理中 )
    private String status;

    // 当前有效状态
    private String aliveFlag;

    // 扩展字段1
    private String extend1;

    // 扩展字段2
    private String extend2;

    // 扩展字段3
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
    private Date createDate;

    // 修改者
    private String updateUser;

    // 修改者姓名
    private String updateName;

    // 修改时间
    private Date updateDate;

    // 版本号
    private Integer version;




}