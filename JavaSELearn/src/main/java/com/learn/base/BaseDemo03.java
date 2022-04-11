package com.learn.base;

/**
 * @Auther:Qi Kaili
 * @Date: Created in 18:34 2022/4/11
 * @Description:
 * @version:1.0
 */
public class BaseDemo03 {
    public static void main(String[] args) {
        /*条件运算符*/
        int a=7;
        int b=6;
        System.out.println(a>b?a:b);
        /*基本数据类型之间的转换
        * 类型转换的方向（由低到高）
        * byte->short,char->int->long->float->double
        * */
        byte c=10;
        int d=c;
        System.out.printf("%d,%d",c,d);
        // c为byte，1个字节， 8位二进制数                                           00001010
        //d为int,4个字节，32位二进制数      00000000    00000000        00000000    00001010
        //由低到高，可以自动完成转型
        System.out.println();
        int f=10;
//        byte e=f;
        byte e=(byte)f;
        //由高到低，必须使用该方式完成强转
        System.out.printf("%d,%d",f,e);
        /*在赋值变量或者强转时，需要记忆各类型的取值范围
        * byte   -128~127
        * short  -32768~32767   3万
        * int    -21 4748 3648   21亿
        * long   最大范围
        * */
        System.out.println();
        int f1=128;
        byte e1=(byte)f1;
        System.out.printf("%d,%d",f1,e1); //128,-128
        //此时不符合范围，就得不到想要的结果
        /*除了每个数据类型的取值范围外，我们还经常提到的就是内存地址
        * 数组存储和链表存储两种方式，为什么通过索引获取集合中的元素时数组要比链表更快？
        数组为连续存储结构，当数组的类型和第一个元素所在位置已知时，其它索引所在位置也可以很快得到；
        链表是每个节点存储内容和下个节点的位置，不是顺序存储；
        例如int类型(每个元素占4个字节)的数组，第一个元素所在的位置为16，
        那么第2个元素所在的位置就是20，第n个就是 16+(n-1)*4
        而链表需要从头遍历，获得每个元素的下一个元素，当该元素为n元素时，才停止遍历。
        *
        如果需要查看是否存在某元素的话，则需要另行讨论：
        比如先排序，然后再二分查找；
        后面可能还有更快捷的方式，学习完算法后继续进行补充。
        *
        * */


    }
}
