/**
 * Project Name:dt59homework
 * File Name:Pet.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午3:58:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午3:58:35 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public abstract class Pet {
	private String name;
	private int age;
	private int health;
	public Pet() {
	
	}	
	public Pet(String name, int age, int health) {
		
		this.name = name;
		this.age = age;
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public abstract void eat();
	public void print(){
		System.out.println("我的名字叫:"+name+",我已经"+age+"岁了,我的健康值是"+health);
	}

}

