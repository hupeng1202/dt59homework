/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:01:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:01:25 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Dog extends Pet{
	private String strain="阿拉斯加";
	
	public Dog(String name, int age, int health) {
		super(name, age, health);	
	}
	
	public Dog(String strain) {
		super();
		this.strain = strain;
	}
	
	public String getStrain() {
		return strain;
	}
	
	public void setStrain(String strain) {
		this.strain = strain;
	}
	
	@Override
	public void eat() {
		setHealth(getHealth()+5);
		System.out.println("我吃了骨头,健康值增加5");
	}
	
	public void print(){
		super.print();
		System.out.println("我是一只"+strain+".");
	}
	

}

