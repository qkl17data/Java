package com.learn.base;

/**
 * @Auther:Qi Kaili
 * @Date: Created in 16:10 2022/4/11
 * @Description:
 * @version:1.0
 */
public class BaseDemo02 {
    /*位运算符
    * */
    public static void main(String[] args) {
        System.out.println(4&5); //4
        System.out.println(4|5);//5
        System.out.println(4^5);//1
        System.out.println(4>>1);//2
        System.out.println(4>>2);//1
        System.out.println(4<<1);//8
        System.out.println(4<<2);//16
        System.out.println(4>>>1);//2
        /*
        4       00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000100
        5       00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000101
        &计算
        两个位都为1时，结果才为1
        |计算
        两个位都为0时，结果才为0
        ^运算 相同取0，不同取1
         >>右移一位，等价于 除以2
         <<左移一位，等价于 乘以2

        * */
    }
}
