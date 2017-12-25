/**
 * Project Name:dt59homework
 * File Name:Max.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:26:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:26:14 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Max {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个数:");
		int a=sc.nextInt();
		System.out.println("请输入第二个数:");
		int b=sc.nextInt();		
		int m=max(a, b);
		System.out.println("较大的数是:"+m);
	}
	public static  int max(int a,int b){	
		if (a>b) {
			return a;
		}else{
			return b;		
		}
		
	}

}

