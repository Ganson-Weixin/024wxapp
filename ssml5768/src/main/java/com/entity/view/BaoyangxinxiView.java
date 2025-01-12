package com.entity.view;

import com.entity.BaoyangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保养信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-02 17:42:31
 */
@TableName("baoyangxinxi")
public class BaoyangxinxiView  extends BaoyangxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoyangxinxiView(){
	}
 
 	public BaoyangxinxiView(BaoyangxinxiEntity baoyangxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, baoyangxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
