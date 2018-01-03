/**
 * Project Name:dt59homework
 * File Name:LogDemo.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:43:58
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午4:43:58 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class LogDemo {
	private final static Logger LOG=Logger.getLogger(LogDemo.class);

	public static void main(String[] args) {
		LOG.info("日志记录");

		

	}

}

