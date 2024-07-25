package com.entity.model;

import com.entity.HaixianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HaixianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商品名称
     */
    private String haixianName;


    /**
     * 商品照片
     */
    private String haixianPhoto;


    /**
     * 视频演示
     */
    private String haixianVideo;


    /**
     * 商品类型
     */
    private Integer haixianTypes;


    /**
     * 商品库存
     */
    private Integer haixianKucunNumber;


    /**
     * 商品原价
     */
    private Double haixianOldMoney;


    /**
     * 现价
     */
    private Double haixianNewMoney;


    /**
     * 点击次数
     */
    private Integer haixianClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer haixianDelete;


    /**
     * 商品简介
     */
    private String haixianContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：商品名称
	 */
    public String getHaixianName() {
        return haixianName;
    }


    /**
	 * 设置：商品名称
	 */
    public void setHaixianName(String haixianName) {
        this.haixianName = haixianName;
    }
    /**
	 * 获取：商品照片
	 */
    public String getHaixianPhoto() {
        return haixianPhoto;
    }


    /**
	 * 设置：商品照片
	 */
    public void setHaixianPhoto(String haixianPhoto) {
        this.haixianPhoto = haixianPhoto;
    }
    /**
	 * 获取：视频演示
	 */
    public String getHaixianVideo() {
        return haixianVideo;
    }


    /**
	 * 设置：视频演示
	 */
    public void setHaixianVideo(String haixianVideo) {
        this.haixianVideo = haixianVideo;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getHaixianTypes() {
        return haixianTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setHaixianTypes(Integer haixianTypes) {
        this.haixianTypes = haixianTypes;
    }
    /**
	 * 获取：商品库存
	 */
    public Integer getHaixianKucunNumber() {
        return haixianKucunNumber;
    }


    /**
	 * 设置：商品库存
	 */
    public void setHaixianKucunNumber(Integer haixianKucunNumber) {
        this.haixianKucunNumber = haixianKucunNumber;
    }
    /**
	 * 获取：商品原价
	 */
    public Double getHaixianOldMoney() {
        return haixianOldMoney;
    }


    /**
	 * 设置：商品原价
	 */
    public void setHaixianOldMoney(Double haixianOldMoney) {
        this.haixianOldMoney = haixianOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getHaixianNewMoney() {
        return haixianNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setHaixianNewMoney(Double haixianNewMoney) {
        this.haixianNewMoney = haixianNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getHaixianClicknum() {
        return haixianClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setHaixianClicknum(Integer haixianClicknum) {
        this.haixianClicknum = haixianClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getHaixianDelete() {
        return haixianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setHaixianDelete(Integer haixianDelete) {
        this.haixianDelete = haixianDelete;
    }
    /**
	 * 获取：商品简介
	 */
    public String getHaixianContent() {
        return haixianContent;
    }


    /**
	 * 设置：商品简介
	 */
    public void setHaixianContent(String haixianContent) {
        this.haixianContent = haixianContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
