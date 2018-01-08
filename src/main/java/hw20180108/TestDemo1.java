/**
 * Project Name:dt59homework
 * File Name:TestDemo1.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:56:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:56:44 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class TestDemo1 {
	public static void main(String[] args) {
		Demo1 de1=new Demo1(7);
		Demo1 de2=new Demo1(8);
		Demo1 de3=new Demo1(9);
		new Thread(de1).start();
		de1.setPriority(Thread.MAX_PRIORITY);
		new Thread(de2).start();
		new Thread(de3).start();
		de1.setPriority(Thread.MIN_PRIORITY);
		
	}

}

