/**
 * Project Name:dt59homework
 * File Name:Demo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午3:43:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;
/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:43:17 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Demo extends Thread{
	private String name;
	Demo(String name){
		this.name=name;
	}
	public void run(){
		System.out.println(name);
	}

}

