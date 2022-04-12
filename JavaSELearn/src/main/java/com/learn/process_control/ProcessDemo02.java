package com.learn.process_control;

/**
 * @Auther:Qi Kaili
 * @Date: Created in 8:32 2022/4/12
 * @Description:
 * @version:1.0
 */
public class ProcessDemo02 {
    /*if 单分支选择结构
    if (条件) {
    // 条件满足时执行
     }
     if-else双分支选择结构
     if-else if-else多分支选择结构
    注：if语句从上到下执行时，先判断n >= 60成功后，
    后续else不再执行，因此，if (n >= 90)没有机会执行了。

    switch 多分支选择   基本在开发中不使用
    1.只能处理等值条件判断的情况，且表达式必须为byte，short，int或char类型 ，
    不能是String或double,float. 1.7之后可以使用string
    2.注意千万不要漏写break，建议打开fall-through警告；
    3.总是写上default，建议打开missing default警告；
    4.从Java 14开始，switch语句正式升级为表达式，不再需要break，并且允许使用yield返回值。
        * */
    public static void main(String[] args) {

//        testIfElse();

        //除了边界条件，我们还需要对相等的判断进行梳理；
        /*在Java中，判断值类型的变量是否相等，可以使用==运算符。
        但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。
        要判断引用类型的变量内容是否相等，必须使用equals()方法;
        当两个变量都不为null
        */
//        testEqual();
//        testEqualNull();
        testSwitch();
//        testSwitch14();   Switch  java14后的版本
    }

/*    private static void testSwitch14() {
          String fruit = "orange";
          int opt = switch (fruit) {
              case "apple" -> 1;
              case "pear", "mango" -> 2;
              default -> {
                  int code = fruit.hashCode();
                  yield code; // switch语句返回值
              }
          };
          System.out.println("opt = " + opt);
      }
*/
    private static void testSwitch() {
        int option = 1;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("No Selected");
                break;
        }

    }

    private static void testIfElse() {
        int n = 90;
        if (n >= 90) {//注意边界条件
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }
    }

    private static void testEqualNull() {
        String s2 = "hello";
        String s1 = null;
//        if (s1.equals(s2)){
//            System.out.println("相等");
//        }
        /*Exception in thread "main" java.lang.NullPointerException
	at com.learn.process_control.ProcessDemo02.testEqualNull(ProcessDemo02.java:48)
	at com.learn.process_control.ProcessDemo02.main(ProcessDemo02.java:30)
	*/
        if (s2.equals(s1)) {//此时并不报错
            System.out.println("相等");
        }
        /*当equals前面的变量s1并不知道是否为null的时候,推荐使用以下语法
         */
        //语法一
        if (s1 != null && s1.equals("hello")) {
            System.out.println("hello");
        }
        //语法二
        if ("hello".equals(s1)) {
            System.out.println("hello");
        }
    }

    private static void testEqual() {
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }
}
