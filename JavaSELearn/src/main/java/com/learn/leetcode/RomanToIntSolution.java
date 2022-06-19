package com.learn.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * 罗马数字转整数
 * */
public class RomanToIntSolution {
    public static void main(String[] args) {
//        System.out.println(romanToInt("III"));
//        System.out.println(romanToInt("IV"));
//        System.out.println(romanToInt("IX"));
//        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char[] arr = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
        for(Character ele:arr){
            list.add(map.get(ele));
        }
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            Integer l = list.get(i);
            Integer r = i+1>= list.size()?0:list.get(i+1);
            if (l<r){
                int result = r - l;
                sum+=result;
                i++;
            }else{
                sum+=l;
            }
        }

        return sum;
    }
}
