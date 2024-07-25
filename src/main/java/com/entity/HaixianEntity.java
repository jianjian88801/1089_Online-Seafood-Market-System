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
 * 商品
 *
 * @author 
 * @email
 */
@TableName("haixian")
public class HaixianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HaixianEntity() {

	}

	public HaixianEntity(T t) {
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
     * 商品名称
     */
    @TableField(value = "haixian_name")

    private String haixianName;


    /**
     * 商品照片
     */
    @TableField(value = "haixian_photo")

    private String haixianPhoto;


    /**
     * 视频演示
     */
    @TableField(value = "haixian_video")

    private String haixianVideo;


    /**
     * 商品类型
     */
    @TableField(value = "haixian_types")

    private Integer haixianTypes;


    /**
     * 商品库存
     */
    @TableField(value = "haixian_kucun_number")

    private Integer haixianKucunNumber;


    /**
     * 商品原价
     */
    @TableField(value = "haixian_old_money")

    private Double haixianOldMoney;


    /**
     * 现价
     */
    @TableField(value = "haixian_new_money")

    private Double haixianNewMoney;


    /**
     * 点击次数
     */
    @TableField(value = "haixian_clicknum")

    private Integer haixianClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "haixian_delete")

    private Integer haixianDelete;


    /**
     * 商品简介
     */
    @TableField(value = "haixian_content")

    private String haixianContent;


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
	 * 设置：商品名称
	 */
    public String getHaixianName() {
        return haixianName;
    }
    /**
	 * 获取：商品名称
	 */

    public void setHaixianName(String haixianName) {
        this.haixianName = haixianName;
    }
    /**
	 * 设置：商品照片
	 */
    public String getHaixianPhoto() {
        return haixianPhoto;
    }
    /**
	 * 获取：商品照片
	 */

    public void setHaixianPhoto(String haixianPhoto) {
        this.haixianPhoto = haixianPhoto;
    }
    /**
	 * 设置：视频演示
	 */
    public String getHaixianVideo() {
        return haixianVideo;
    }
    /**
	 * 获取：视频演示
	 */

    public void setHaixianVideo(String haixianVideo) {
        this.haixianVideo = haixianVideo;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getHaixianTypes() {
        return haixianTypes;
    }
    /**
	 * 获取：商品类型
	 */

    public void setHaixianTypes(Integer haixianTypes) {
        this.haixianTypes = haixianTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getHaixianKucunNumber() {
        return haixianKucunNumber;
    }
    /**
	 * 获取：商品库存
	 */

    public void setHaixianKucunNumber(Integer haixianKucunNumber) {
        this.haixianKucunNumber = haixianKucunNumber;
    }
    /**
	 * 设置：商品原价
	 */
    public Double getHaixianOldMoney() {
        return haixianOldMoney;
    }
    /**
	 * 获取：商品原价
	 */

    public void setHaixianOldMoney(Double haixianOldMoney) {
        this.haixianOldMoney = haixianOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getHaixianNewMoney() {
        return haixianNewMoney;
    }
    /**
	 * 获取：现价
	 */

    public void setHaixianNewMoney(Double haixianNewMoney) {
        this.haixianNewMoney = haixianNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getHaixianClicknum() {
        return haixianClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setHaixianClicknum(Integer haixianClicknum) {
        this.haixianClicknum = haixianClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }
    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getHaixianDelete() {
        return haixianDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setHaixianDelete(Integer haixianDelete) {
        this.haixianDelete = haixianDelete;
    }
    /**
	 * 设置：商品简介
	 */
    public String getHaixianContent() {
        return haixianContent;
    }
    /**
	 * 获取：商品简介
	 */

    public void setHaixianContent(String haixianContent) {
        this.haixianContent = haixianContent;
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
        return "Haixian{" +
            "id=" + id +
            ", haixianName=" + haixianName +
            ", haixianPhoto=" + haixianPhoto +
            ", haixianVideo=" + haixianVideo +
            ", haixianTypes=" + haixianTypes +
            ", haixianKucunNumber=" + haixianKucunNumber +
            ", haixianOldMoney=" + haixianOldMoney +
            ", haixianNewMoney=" + haixianNewMoney +
            ", haixianClicknum=" + haixianClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", haixianDelete=" + haixianDelete +
            ", haixianContent=" + haixianContent +
            ", createTime=" + createTime +
        "}";
    }
}
