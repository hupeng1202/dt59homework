/**
 * Project Name:dt59homework
 * File Name:Student1.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午9:04:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午9:04:37 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Student1 extends Student{

	
	public void learn() {
		System.out.println("学生1喜欢学Java");	
	}
	public static void main(String[] args) {
		Student stu=new Student1();
		stu.learn();
		stu.print();
	}

}

