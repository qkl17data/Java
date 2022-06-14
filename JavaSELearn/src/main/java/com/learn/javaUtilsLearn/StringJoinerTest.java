package com.learn.javaUtilsLearn;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        test();
        //鐢ㄥ垎闅旂鎷兼帴鏁扮粍鐨勯渶姹?
        // 鎸囧畾棣栦綅鐢⊿tringJoiner
        testStringJoiner();
        //涓嶉渶瑕佹寚瀹氶浣?
        testStringJoin();
    }

    private static void testStringJoin() {
        String[] names = {"Bob", "Alice", "Grace"};
        var s = String.join(", ", names);
        System.out.println(s);
    }

    private static void testStringJoiner() {
        String[] names = {"Bob", "Alice", "Grace"};
        StringJoiner joiner = new StringJoiner(", ","Hello ","!");
        for (String name:names){
            joiner.add(name);
        }
        System.out.println(joiner.toString());
    }

    private static void test() {
        String[] names = {"Bob", "Alice", "Grace"};
        var sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        System.out.println(sb.toString());
        // 娉ㄦ剰鍘绘帀鏈€鍚庣殑", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
    }
}
