/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:02:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:02:02 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Cat extends Pet{
	private String sex="母";

	public Cat(String name, int age, int health) {
		super(name,age,health);	
	}
	
	public Cat(String sex) {
		super();
		this.sex = sex;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	public void eat() {
		setHealth(getHealth()+10);
		System.out.println("我吃了鱼,健康值加10");
	}
	
	public void print(){
		super.print();
		System.out.println("我的性别是:"+sex);
	}

}

