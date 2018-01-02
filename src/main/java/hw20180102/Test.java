/**
 * Project Name:dt59homework
 * File Name:Test.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:33:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:33:45 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Test {
	public static void main(String[] args) {
		Pet dog=new Dog("可可",3,50);
		Pet cat=new Cat("豆豆",4,60);
		Master master=new Master();
		cat.print();
		master.feed(cat);
		dog.print();
		master.feed(dog);
	}

}

