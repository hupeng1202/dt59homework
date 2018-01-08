/**
 * Project Name:dt59homework
 * File Name:Demo1.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:54:19
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:54:19 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Demo1 implements Runnable{
	private int i;
	Demo1(int i){
		this.i=i;
	}

	public void run() {
		System.out.println(i);
		
		
	}

}

