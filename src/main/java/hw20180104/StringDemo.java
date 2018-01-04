/**
 * Project Name:dt59homework
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:16:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;



/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:16:15 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class StringDemo {
	private final static Logger LOG=Logger.getLogger(StringDemo.class);
	public static void main(String[] args) {
		
		String  str=" a6c 1 e* ";
		LOG.info(str.charAt(3));//返回指定索引处的 char 值。
		LOG.info(str.codePointAt(5));//返回指定索引处的字符。
		LOG.info(str.concat("123"));// 将指定字符串连接到此字符串的结尾。
		LOG.info(str.contains(" a6c "));//将此字符串与指定的对象比较。
		LOG.info(str.equals(" a6c 1 e* "));//将此字符串与指定的对象比较。
		LOG.info(str.endsWith(" "));//测试此字符串是否以指定的后缀结束
		LOG.info(str.hashCode()); //返回此字符串的哈希码
		LOG.info(str.indexOf("c",4)); //返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
		LOG.info(str.substring(7)); //返回一个新的字符串，它是此字符串的一个子字符串。
		LOG.info(str.trim());//返回字符串的副本，忽略前导空白和尾部空白。
	}
	
	

}

