/**
 * Project Name:dt59homework
 * File Name:DateTransform.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午6:07:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午6:07:53 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class DateTransform {
    public static void main(String[] args) {  
    	//格式：Sun Jan 07 18:13:03 CST 2018
        Date dt =new Date();  
        System.out.println(dt); 
          
        //格式：2018-1-7  
        String formatDate = null;  
        formatDate = DateFormat.getDateInstance().format(dt);  
        System.out.println(formatDate);    
          
        //格式：2018年1月7日 星期日 
        formatDate = DateFormat.getDateInstance(DateFormat.FULL).format(dt);  
        System.out.println(formatDate);  
          
        //格式 24小时制：2018-01-07 09:39:58  
        DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   
        formatDate = dFormat.format(dt);  
        System.out.println(formatDate);  
          
        //格式12小时制：2018-01-07 09:42:44  
        DateFormat dFormat12 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
        formatDate = dFormat12.format(dt);  
        System.out.println(formatDate);  
          
        //格式去掉分隔符24小时制：20180107094533  
        DateFormat dFormat3 = new SimpleDateFormat("yyyyMMddHHmmss");  
        formatDate = dFormat3.format(dt);  
        System.out.println(formatDate);  
    }  
  
}  



