package com.learn.javaUtilsLearn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//        testPhoneNum("010-12345678");
        /**
         * 复杂匹配规则
         * 用正则表达式进行多行匹配时，我们用^表示开头，$表示结尾  ^A\\d{3}$ 匹配A221
         * 使用[]匹配指定范围   [1-9]字符1-9  a-f字符a-f   大小写不限的十六进制 [1-9a-fA-F]
         * 排除法 [^1-9]{3} 非1-9中字符的3位数
         * 或匹配规则  用 | 连接的两个正则规则   java|php
         * 使用括号 匹配字符串learn java、learn php和learn go   learn\\s(java|php|go)
         * */

        /**
         * 分割、搜索和替换
         *
         * */
        findAndSearch();

        /**
         * 分组匹配 ：用(...)先把要提取的规则分组，把上述正则表达式变为(\d{3,4})\-(\d{6,8})。
         * */
//        testGroup();
//        testGroup1();
        //正则表达式匹配默认使用贪婪匹配，可以使用?表示对某一规则进行非贪婪匹配。
//        testPiPei();

    }

    private static void findAndSearch() {
        //搜索字符串
//        String s = "the quick brown fox jumps over the lazy dog.";
//        Pattern p = Pattern.compile("\\wo\\w");
//        Matcher m = p.matcher(s);
//        while (m.find()) {
//            String sub = s.substring(m.start(), m.end());
//            System.out.println(sub);
//        }
        String s = "a56b-6-8()_56!@$-a";
        Pattern p = Pattern.compile("-?\\d+");

        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            System.out.println(s.substring(matcher.start(), matcher.end()));
        }
        //分割字符串
        "a, b ;; c".split("[\\,\\;\\s]+");
        //替换字符串
        String s1 = "The     quick\t\t brown   fox  jumps   over the  lazy dog.";
        String r = s1.replaceAll("\\s+", " ");
        System.out.println(r); // "The quick brown fox jumps over the lazy dog."

        //反向引用 ：把搜索到的指定字符串按规则替换
        String s2 = "the quick brown fox jumps over the lazy dog.";
        String r2 = s2.replaceAll("\\s([a-z]{4})\\s", " <b>$1</b> ");
        System.out.println(r2);

    }

    private static void testPiPei() {
        Pattern pattern = Pattern.compile("(\\d+)(0*)");
        Matcher matcher = pattern.matcher("1230000");
        if (matcher.matches()) {
            System.out.println("group1=" + matcher.group(1)); // "1230000"
            System.out.println("group2=" + matcher.group(2)); // ""
        }
        Pattern pattern1 = Pattern.compile("(\\d+?)(0*)");
        Matcher matcher1 = pattern1.matcher("1230000");
        if (matcher1.matches()) {
            System.out.println("group1=" + matcher1.group(1)); // "123"
            System.out.println("group2=" + matcher1.group(2)); // "0000"
        }
    }

    private static void testGroup1() {
        //先创建出一个Pattern对象
        Pattern p = Pattern.compile("(\\d{2})\\:(\\d{2})\\:(\\d{2})");
        //获得Matcher对象
        Matcher matcher = p.matcher("23:01:59");
        if (matcher.matches()) {
            System.out.println(String.format("时：%s,分：%s,秒：%s", matcher.group(1), matcher.group(2), matcher.group(3)));
        }
    }

    private static void testGroup() {
        Pattern p = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        Matcher m = p.matcher("010-12345678");
        if (m.matches()) {
            String g1 = m.group(1);
            String g2 = m.group(2);
            System.out.println(g1);
            System.out.println(g2);
        } else {
            System.out.println("匹配失败!");
        }
        /**
         * group(0)表示匹配的整个字符串；
         * group(1)表示第1个子串，group(2)表示第2个子串
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
