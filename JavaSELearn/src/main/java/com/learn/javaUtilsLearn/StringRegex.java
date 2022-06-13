package com.learn.javaUtilsLearn;

public class StringRegex {
    /**
     * 正则表达式可以用字符串来描述规则，并用来匹配字符串
     */
    public static void main(String[] args) {
//        test();
        /**
         * 正则表达式的匹配规则是从左到右按规则匹配
         * 如果正则表达式有特殊字符，那就需要用\转义  其中\&是用来匹配特殊字符&的
         * 所以，对于正则表达式a\&c来说，对应的Java字符串是"a\\&c"，因为\也是Java字符串的转义字符，两个\\实际上表示的是一个\
         * */
//        test01();
        /**
         * 简单匹配规则
         * 用.匹配一个任意字符。 .匹配一个字符且仅限一个字符
         * \d仅限单个数字字符。
         * 用\w可以匹配一个字母、数字或下划线
         * 用\s可以匹配一个空格字符，注意空格字符不但包括空格，还包括tab字符（在Java中用\t表示）
         *  修饰符*可以匹配任意个字符，包括0个字符
         *  修饰符+可以匹配至少一个字符
         *  修饰符?可以匹配0个或一个字符
         *  精确指定n个字符  修饰符{n}   A\d{3}
         *  指定匹配n~m个字符   修饰符{n,m} A\d{3,5}
         *  如果没有上限，那么修饰符{n,}就可以匹配至少n个字符
         * ====
         * 用\d可以匹配一个数字，而\D则匹配一个非数字
         * \W可以匹配\w不能匹配的字符
         * \S可以匹配\s不能匹配的字符
         * */

        testPhoneNum("010-12345678");
        /**
         * 复杂匹配规则
         *
         * */
    }

    private static void testPhoneNum(String phoneNum) {
        String reg = "\\d{3,4}-\\d{7,8}";
        System.out.println(phoneNum.matches(reg));
    }

    private static void test01() {
        //特殊字符匹配
        String re1 = "a\\&c";

        System.out.println("a&c".matches(re1));
    }

    private static void test() {
        //\d表示任意一个数字   Java字符串用\\表示\
        String regex = "20\\d\\d";
        System.out.println("2019".matches(regex)); // true
        System.out.println("2100".matches(regex)); // false
    }
}
