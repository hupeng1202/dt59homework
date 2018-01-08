/**
 * Project Name:dt59homework
 * File Name:TestDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:49:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:49:42 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class TestDemo {
	public static void main(String[] args) {
		Demo d1=new Demo("1");
		Demo d2=new Demo("2");
		Demo d3=new Demo("3");
		d1.start();
		d1.setPriority(Thread.MAX_PRIORITY);
		d2.start();
		d3.start();
		d3.setPriority(Thread.MIN_PRIORITY);
		
	}

}

