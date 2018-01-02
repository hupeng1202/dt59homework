/**
 * Project Name:dt59homework
 * File Name:Master.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:29:46
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:29:46 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Master {
	private String name;
	private Object dog;

	public Master() {
		super();
	}

	public Master(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void feed(Dog dog){
		dog.eat();
	}
    public void feed(Pet cat){
		cat.eat();
	}


}

