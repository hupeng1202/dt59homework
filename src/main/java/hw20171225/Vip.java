/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:hw20171225
 * Date:2017年12月25日下午5:44:13
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:44:13 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class Vip {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入购物金额:");
		double money=sc.nextDouble();
		System.out.println("请输入你的会员等级:");
		int m=sc.nextInt();		
		Vip vip=new Vip();
		double dMoney = 0;
		System.out.println("打折后你需要支付的金额:"+vip.discount(m, money, dMoney));
	}
	double discount(int m,double money,double dMoney){
		switch (m) {
			case 1://"至尊级" 
				dMoney=money*0.75;
				break;
			case 2://"钻石级" 
				dMoney=money*0.8;
				break;
			case 3://"铂金级 "
				dMoney=money*0.85;
				break;
			case 4://"黄金级" 
				dMoney=money*0.9;
				break;
			case 5://"白银级" 
				dMoney=money*0.95;
				break;
			default :
				break;
		}
		return dMoney;
	}

}

