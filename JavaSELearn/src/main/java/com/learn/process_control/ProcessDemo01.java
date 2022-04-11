package com.learn.process_control;

import java.util.Scanner;

/**
 * @Auther:Qi Kaili
 * @Date: Created in 22:04 2022/4/11
 * @Description:
 * @version:1.0
 */
public class ProcessDemo01 {
    /*三种基本流程结构：顺序结构、分支结构(条件判断)和循环结构
    * 输入、输出知识点讲解及案例
    * */
    public static void main(String[] args) {
//输出

        System.out.println("输出并换行");//表示输出并换行
        System.out.print("我只是输出，并不换行");
        System.out.print("  ");
        System.out.print("我只是输出，并不换行");
        System.out.println();
//格式化输出
        /*如果要把数据显示成我们期望的格式，就需要使用格式化输出的功能。格式化输出使用System.out.printf()，
        通过使用占位符%?，printf()可以把后面的参数格式化成指定格式
        %d	格式化输出整数
        %x	格式化输出十六进制整数
        %f	格式化输出浮点数
        %e	格式化输出科学计数法表示的浮点数
        %s	格式化字符串
        */
        int a=10;
        int b=1;
        double c=3.1415726;
        String d="格式化输出";

        System.out.printf("%s:a的值为%d,b的值为%x,c的值为%.2f",d,a,b,c);
        System.out.println();
//输入
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }
}
