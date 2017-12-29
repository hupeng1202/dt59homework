/**
 * Project Name:dt59homework
 * File Name:Car1.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午8:35:30
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午8:35:30 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Car extends Vehicle{


	private String color="红色";
	public void run1(){
		
	}
	public Car(String name, String price) {
		
		super(name, price);
		
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public void summary(){
		super.summary();
		System.out.println("小汽车的颜色是"+color);
	}
	

}

