/**
 * Project Name:dt59homework
 * File Name:ListFile.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午5:39:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午5:39:16 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class ListFile {
	public void listJavaFile(String fileName) {    
        File file = new File(fileName);    
        if (file.isDirectory()) {    
            File[] files = file.listFiles();    
            for (int i = 0; i < files.length; i++) {    
                String name = files[i].getName();    
                if (name.trim().toLowerCase().endsWith(".java")) {    
                    System.out.println(name + "\t");    
                }    
                if (files[i].isDirectory()) {    
                    String path = files[i].getPath();    
                    listJavaFile(path);    
                }    
            }    
        }    
    }    
  
    public static void main(String[] args) {  
       
        ListFile listfile = new ListFile();  
        listfile.listJavaFile("E:\\javaworkspace\\mytest1\\src\\threadtest");  
    }  
  
}  



