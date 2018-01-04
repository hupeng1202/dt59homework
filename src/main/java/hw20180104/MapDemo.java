/**
 * Project Name:dt59homework
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:49:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午3:49:25 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class MapDemo {
	private final static Logger LOG=Logger.getLogger(MapDemo.class);
	public static void main(String[] args) {
		
		Map<String,String> map=new HashMap<String, String>();	
		//添加
		map.put("01", "胡鵬");
		map.put("02", "羅娟");
		//修改
		map.put("02", "不是羅娟");
		map.put("03", "孫浩");
		//判斷是否包含
		LOG.info(map.containsKey("01"));
		LOG.info(map.containsValue("胡鵬"));
		LOG.info(map.equals(("01胡鵬")));
		//查詢
		LOG.info(map.get("01"));
		//哈希碼
		LOG.info(map.hashCode());
		//映射关系数
		LOG.info(map.size());
		
		//刪除
		//LOG.info(map.remove("02"));
		LOG.info(map.keySet());
		LOG.info(map.values());
		//遍历
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		for(Object x:set){
			LOG.info(x);
		}

	}

}

