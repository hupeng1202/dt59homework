/**
 * Project Name:dt59homework
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:13:14
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;




import java.util.ArrayList;

import org.apache.log4j.Logger;



/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午3:13:14 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class ListDemo {
	private final static Logger LOG=Logger.getLogger(ListDemo.class);
	public static void main(String[] args) {
		
		ArrayList lst=new ArrayList<>();
		//添加
		LOG.info(lst.add("1aA &*"));	
		lst.add("a");
		lst.add("sasasa");
		//刪除
		//lst.clear();
		//判斷
		LOG.info(lst.contains("a"));
		LOG.info(lst.equals("1aA &"));
		//哈希碼
		LOG.info(lst.hashCode());
		//查詢
		LOG.info(lst.indexOf("sasasa"));
		LOG.info(lst.isEmpty());
		//遍歷
		LOG.info(lst.iterator());
		//截取
		LOG.info(lst.subList(1, 3));
		
		//修改
		LOG.info(lst.set(2, "asdfg"));
		LOG.info(lst.listIterator(2));
		LOG.info(lst);
	}

}

