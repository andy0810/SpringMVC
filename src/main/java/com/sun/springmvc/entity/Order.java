package com.sun.springmvc.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author sunzhongshu
 * @since 2020-01-08
 */
@Data
@Accessors(chain = true)
@TableName("tb_dw_order")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;
    /**
     * 订单code
     */
    @TableField("order_code")
    private String orderCode;
    /**
     * 设备id
     */
    @TableField("device_id")
    private Long deviceId;
    /**
     * 运营商id
     */
    @TableField("operator_id")
    private Long operatorId;
    /**
     * 经销商id
     */
    @TableField("distributor_id")
    private Long distributorId;
    /**
     * 商户id
     */
    @TableField("user_id")
    private Long userId;
    /**
     * 微信用户id
     */
    @TableField("wx_user_id")
    private Long wxUserId;
    /**
     * 订单价格
     */
    @TableField("order_cost")
    private Long orderCost;
    /**
     * 支付类型（0：现金;   1：微信;  2：支付宝;  3：银行卡;   4：银联; 5:积分）
     */
    @TableField("pay_type")
    private Integer payType;
    /**
     * 订单状态（-1:已取消; 0:未支付; 1:已支付; 2:支付中）
     */
    @TableField("order_status")
    private Integer orderStatus;
    /**
     * 订单来源（0:线下订单;  1:预约订单;）
     */
    @TableField("order_resource")
    private Integer orderResource;
    /**
     * 删除状态（0:未删除; 1:已删除）
     */
    @TableField("del_status")
    private Integer delStatus;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 是否扫码(0:未扫码; 1:已扫码)
     */
    @TableField("reserver_other1")
    private String reserverOther1;
    /**
     * 预留字段2
     */
    @TableField("reserver_other2")
    private String reserverOther2;
    /**
     * 预留字段3
     */
    @TableField("reserver_other3")
    private String reserverOther3;
    /**
     * 预留字段4
     */
    @TableField("reserver_other4")
    private String reserverOther4;
    /**
     * 预留字段5
     */
    @TableField("reserver_other5")
    private String reserverOther5;
    /**
     * 退款状态（0：未退款； 1：已退款； 2：退款中）
     */
    @TableField("return_status")
    private Integer returnStatus;
    /**
     * 交易单号
     */
    @TableField("trade_no")
    private String tradeNo;


    public static final String ID = "id";

    public static final String ORDER_CODE = "order_code";

    public static final String DEVICE_ID = "device_id";

    public static final String OPERATOR_ID = "operator_id";

    public static final String DISTRIBUTOR_ID = "distributor_id";

    public static final String USER_ID = "user_id";

    public static final String WX_USER_ID = "wx_user_id";

    public static final String ORDER_COST = "order_cost";

    public static final String PAY_TYPE = "pay_type";

    public static final String ORDER_STATUS = "order_status";

    public static final String ORDER_RESOURCE = "order_resource";

    public static final String DEL_STATUS = "del_status";

    public static final String CREATE_TIME = "create_time";

    public static final String UPDATE_TIME = "update_time";

    public static final String RESERVER_OTHER1 = "reserver_other1";

    public static final String RESERVER_OTHER2 = "reserver_other2";

    public static final String RESERVER_OTHER3 = "reserver_other3";

    public static final String RESERVER_OTHER4 = "reserver_other4";

    public static final String RESERVER_OTHER5 = "reserver_other5";

    public static final String RETURN_STATUS = "return_status";

    public static final String TRADE_NO = "trade_no";

}
