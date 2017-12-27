/**
 * Project Name:dt59homework
 * File Name:Lesson2.java
 * Package Name:hw20171227
 * Date:2017年12月27日下午6:56:42
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午6:56:42 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Lesson2 {
	int a=1;
	double b=2.0;
	public static void main(String[] args) {
		Lesson2();
	}
	public static void Lesson2() {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入a的值:");
		int a=input.nextInt();
		System.out.println("请输入b的值:");
		double b=input.nextDouble();
		System.out.println(a);
		System.out.println(b);
		
	}
	

}

