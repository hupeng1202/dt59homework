/**
 * Project Name:dt59homework
 * File Name:Truck.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午8:41:03
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午8:41:03 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Truck extends Vehicle{
	private String color2="绿色";
	public void carry2(){
		
	}
	public Truck(String name, String price) {
		
		super(name, price);
		
		
	}
	public String getColor2() {
		return color2;
	}
	public void setColor2(String color2) {
		this.color2 = color2;
	}
	public Truck(String name, String price, String color2) {
		super(name, price);
		this.color2 = color2;
	}
	public void summary(){
		super.summary();
		System.out.println("卡车的颜色是:"+color2);
	}

}

