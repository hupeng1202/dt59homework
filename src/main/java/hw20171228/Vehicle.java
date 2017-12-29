/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午8:19:41
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * 1)在hw20171228类包中，编写一个车的抽象类，先定义车的简介
 * 方法summary()，输出车的概要信息，再自由定义两个属性、两个方法；
 * 定义一个小汽车的类和大卡车的类，要求：a）继承车的抽象类,b）
 * 分别定义一个以上的属性和方法
 * 2)接第1题，在小汽车类中，添加输出小洗车整体介绍信息方法，方法中，
 * 除输出小洗车本类中的属性外，还要输出父类中的属性信息。
 * 3)在hw20171228.huxury类包中，编写一个豪华汽车的类，
 * 输出信息中，包括“我是豪车。。。”形式的内容，并添加相应属性方法。
 * 4)编写一个抽象类，并定义一个抽象方法，再编写一个实现类，继承该抽象类；
 * Description:   <br/>
 * Date:     2017年12月29日 下午8:19:41 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public abstract class Vehicle {
	private String name;
	private String price;
	public void summary(){
		System.out.println("车型为:"+name+";颜色为:"+price);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	

	public Vehicle(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void run(){
		
	}
	public void carry(){
		
	}
	

	
}

