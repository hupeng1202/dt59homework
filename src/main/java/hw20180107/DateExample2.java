/**
 * Project Name:dt59homework
 * File Name:DateExample2.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午6:04:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午6:04:32 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class DateExample2 {
	public static void main(String[] args) 
	 {
	  SimpleDateFormat bartDateFormat = new SimpleDateFormat
	  				("EEEE-MMMM-dd-yyyy"); 
	  Date date = new Date(); 
	  System.out.println(bartDateFormat.format(date)); 
	  } 

}

