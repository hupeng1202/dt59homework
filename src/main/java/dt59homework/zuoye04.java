package dt59homework;
import java.util.Scanner;

/**
 * Project Name:30_胡鹏_20171217
 * File Name:zuoye04.java
 * Package Name:
 * Date:2017年12月17日下午11:02:48
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

/**
 * Description: <br/>
 * Date: 2017年12月17日 下午11:02:48 <br/>
 * 
 * @author hupeng
 * @version
 * @see
 */
public class zuoye04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("请输入正方形的边长： ");
        int n = input.nextInt();
        int[][] array = new int[n][n];
        // 如何将二维数组赋值（重点）
        // m 用来控制层数
        for (int m = 0; m <= n / 2; m++) {
            // i 用来控制行数
            for (int i = 0; i < n; i++) {
                // j 用来控制列数
                for (int j = 0; j < n; j++) {
                    if ((i >= m && i < n - m) && (j >= m && j < n - m)) {
                        array[i][j] = m + 1;
                    }
                }
            }
        }
        // 遍历二维数组
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}

// 使用坐标的思想，通过控制横坐标i和纵坐标j，来控制输出的位置；
// 通过每一层的具体的实现方式来找其中的规律
// 第一层，输出结果全部要求为 1;
// if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
// array4[i][j] = 1;
// }
// 第一层，输出结果全部要求为 1;
// if ((i >= 0 && i < n - 0) && (j >= 0 && j < n - 0)) {
// array4[i][j] = 1;
// }
// 第二层，输出结果全部要求为 2;
// if ((i >= 1 && i < n - 1) && (j >= 1 && j < n - 1)) {
// array4[i][j] = 2;
// }
// 第三层，输出结果全部要求为 3;
// if ((i >= 2 && i < n - 2) && (j >= 2 && j < n - 2)) {
// array4[i][j] = 3;
// }