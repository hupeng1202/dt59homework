/**
 * Project Name:dt59homework
 * File Name:CopyFile.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午6:16:10
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午6:16:10 <br/>
 * @author   hupeng
 * @version
 * @see
 */
public class CopyFile {
	public static void main(String[] args) {
        File filein=new File("new_CopyFile.java");  
        File fileout=new File("CopyOfCopyFile.java");  
        byte[] buffer=new byte[1024];  
        int temp=0;  
        FileInputStream fis=null;  
        FileOutputStream fos=null;  
        try {  
            fis=new FileInputStream(filein);  
            fos=new FileOutputStream(fileout);  
            while((temp=fis.read(buffer))!=-1){  
                fos.write(buffer, 0, temp);  
            }  
            fos.flush();  
            System.out.println("copy完成！！！");  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }catch(IOException e){  
            e.printStackTrace();  
        }finally{  
            if(fos!=null){  
                try {  
                    fos.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
            if(fis!=null){  
                try {  
                    fis.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
          
         }  
    }  
}

