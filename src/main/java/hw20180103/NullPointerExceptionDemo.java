/**
 * Project Name:dt59homework
 * File Name:LOG.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:06:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午3:06:15 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class NullPointerExceptionDemo {
	private final static Logger LOG=Logger.getLogger(LogDemo.class);
	    public static void main(String[] args) {
			
		Scanner input=new Scanner(System.in);
		LOG.info("请输入:");
		try {
			String str = null;
			String s=input.next();
			if (str.equals(s)) {
				
				LOG.info(str);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		input.close();
	    }
	}



