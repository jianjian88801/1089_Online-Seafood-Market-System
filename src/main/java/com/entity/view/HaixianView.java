package com.entity.view;

import com.entity.HaixianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("haixian")
public class HaixianView extends HaixianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 商品类型的值
		*/
		private String haixianValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public HaixianView() {

	}

	public HaixianView(HaixianEntity haixianEntity) {
		try {
			BeanUtils.copyProperties(this, haixianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 商品类型的值
			*/
			public String getHaixianValue() {
				return haixianValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setHaixianValue(String haixianValue) {
				this.haixianValue = haixianValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}












}
