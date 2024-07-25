package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 商品订单
 *
 * @author 
 * @email
 */
@TableName("haixian_order")
public class HaixianOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HaixianOrderEntity() {

	}

	public HaixianOrderEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 订单号
     */
    @TableField(value = "haixian_order_uuid_number")

    private String haixianOrderUuidNumber;


    /**
     * 收货地址
     */
    @TableField(value = "address_id")

    private Integer addressId;


    /**
     * 商品
     */
    @TableField(value = "haixian_id")

    private Integer haixianId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 购买数量
     */
    @TableField(value = "buy_number")

    private Integer buyNumber;


    /**
     * 实付价格
     */
    @TableField(value = "haixian_order_true_price")

    private Double haixianOrderTruePrice;


    /**
     * 订单类型
     */
    @TableField(value = "haixian_order_types")

    private Integer haixianOrderTypes;


    /**
     * 快递公司
     */
    @TableField(value = "haixian_order_courier_name")

    private String haixianOrderCourierName;


    /**
     * 快递单号
     */
    @TableField(value = "haixian_order_courier_number")

    private String haixianOrderCourierNumber;


    /**
     * 支付类型
     */
    @TableField(value = "haixian_order_payment_types")

    private Integer haixianOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getHaixianOrderUuidNumber() {
        return haixianOrderUuidNumber;
    }
    /**
	 * 获取：订单号
	 */

    public void setHaixianOrderUuidNumber(String haixianOrderUuidNumber) {
        this.haixianOrderUuidNumber = haixianOrderUuidNumber;
    }
    /**
	 * 设置：收货地址
	 */
    public Integer getAddressId() {
        return addressId;
    }
    /**
	 * 获取：收货地址
	 */

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    /**
	 * 设置：商品
	 */
    public Integer getHaixianId() {
        return haixianId;
    }
    /**
	 * 获取：商品
	 */

    public void setHaixianId(Integer haixianId) {
        this.haixianId = haixianId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }
    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getHaixianOrderTruePrice() {
        return haixianOrderTruePrice;
    }
    /**
	 * 获取：实付价格
	 */

    public void setHaixianOrderTruePrice(Double haixianOrderTruePrice) {
        this.haixianOrderTruePrice = haixianOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getHaixianOrderTypes() {
        return haixianOrderTypes;
    }
    /**
	 * 获取：订单类型
	 */

    public void setHaixianOrderTypes(Integer haixianOrderTypes) {
        this.haixianOrderTypes = haixianOrderTypes;
    }
    /**
	 * 设置：快递公司
	 */
    public String getHaixianOrderCourierName() {
        return haixianOrderCourierName;
    }
    /**
	 * 获取：快递公司
	 */

    public void setHaixianOrderCourierName(String haixianOrderCourierName) {
        this.haixianOrderCourierName = haixianOrderCourierName;
    }
    /**
	 * 设置：快递单号
	 */
    public String getHaixianOrderCourierNumber() {
        return haixianOrderCourierNumber;
    }
    /**
	 * 获取：快递单号
	 */

    public void setHaixianOrderCourierNumber(String haixianOrderCourierNumber) {
        this.haixianOrderCourierNumber = haixianOrderCourierNumber;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getHaixianOrderPaymentTypes() {
        return haixianOrderPaymentTypes;
    }
    /**
	 * 获取：支付类型
	 */

    public void setHaixianOrderPaymentTypes(Integer haixianOrderPaymentTypes) {
        this.haixianOrderPaymentTypes = haixianOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "HaixianOrder{" +
            "id=" + id +
            ", haixianOrderUuidNumber=" + haixianOrderUuidNumber +
            ", addressId=" + addressId +
            ", haixianId=" + haixianId +
            ", yonghuId=" + yonghuId +
            ", buyNumber=" + buyNumber +
            ", haixianOrderTruePrice=" + haixianOrderTruePrice +
            ", haixianOrderTypes=" + haixianOrderTypes +
            ", haixianOrderCourierName=" + haixianOrderCourierName +
            ", haixianOrderCourierNumber=" + haixianOrderCourierNumber +
            ", haixianOrderPaymentTypes=" + haixianOrderPaymentTypes +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
