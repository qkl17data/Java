package com.learn.javaUtilsLearn;

import java.util.regex.Pattern;

public class SubStringTest {
    /**
     * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列
     */
    public static void main(String[] args) {
//        System.out.println(isSubsequence("abc", "ahbgdc"));

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {3, 4, 5, 1, 2};
        int i = canCompleteCircuit(arr, arr1);

        System.out.println(i == 3);

        int[] arr2 = {1, 2, 3, 4, 5, 5, 70};
        int[] arr3 = {2, 3, 4, 3, 9, 6, 2};
        int j = canCompleteCircuit1(arr2, arr3);
        int k = canCompleteCircuit2(arr2, arr3);

        System.out.println(j);
    }

    private static int canCompleteCircuit2(int[] gas, int[] cost) {
        int start = 0;
        int gasSum = 0;
        int costSum = 0;
        int step = 0;
        while (step < gas.length && start < gas.length) {
            if (start + step < gas.length) {
                gasSum += gas[start + step];
                costSum += cost[start + step];
                step++;
            } else {
                gasSum += gas[start + step - gas.length];
                costSum += cost[start + step - gas.length];
                step++;
            }

            if (costSum > gasSum) {
                step = 0;
                start++;
                gasSum = 0;
                costSum = 0;
            }
        }
        if (gasSum >= costSum && step == gas.length) {
            return start;
        } else {
            return -1;
        }
    }

    public static int canCompleteCircuit1(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n) {
            int sumOfGas = 0;
            int sumOfCost = 0;
            int cnt = 0;
            while (cnt < n) {
                int j = (i + cnt) % n;
                sumOfGas += gas[j];
                sumOfCost += cost[j];
                if (sumOfCost > sumOfGas) {
                    break;
                }
                cnt++;
            }
            if (cnt == n) {
                return i;
            } else {
                i = i + cnt + 1;
            }
        }
        return -1;
    }


    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        for (int i = 0; i < gas.length; i++) {
            gasSum += gas[i];
        }
        int costSum = 0;
        for (int i = 0; i < cost.length; i++) {
            costSum += cost[i];
        }
        if (costSum > gasSum) {
            return -1;
        }
        int start = 0;
        gasSum = 0;
        costSum = 0;
        int step = 0;
        while (step < gas.length && start < gas.length) {
            if (start + step < gas.length) {
                gasSum += gas[start + step];
                costSum += cost[start + step];
                step++;
            } else {
                gasSum += gas[start + step - gas.length];
                costSum += cost[start + step - gas.length];
                step++;
            }
            if (costSum > gasSum) {
                start=start+step+1;
                step = 0;
                gasSum = 0;
                costSum = 0;
            }
        }
        if (gasSum > costSum) {
            return start;
        } else {
            return -1;
        }

    }

    private static boolean isSubsequence1(String s, String t) {
        //方法二：正则匹配
        String s1 = t.replaceAll("", "\\s");
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int length = s.length();
        int i = 0;
        int j = 0;
        while (j <= length) {
            sb.insert(i, "\\w?|\\w");
            i = i + "\\w+?".length() + 1;
            j += 1;
        }
        System.out.println(sb.toString());
        Pattern compile = Pattern.compile(sb.toString());
        boolean matches = compile.matcher(s).matches();
        return matches;
    }

    public static boolean isSubsequence(String s, String t) {
        //方法一：暴力匹配
        int n = 0;
        int len = s.length();
        int j = 0;
        for (int i = 0; i < len; i++) {
            while (j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    n++;
                    break;
                }
                j++;
            }
        }

        return n == len;
    }
}
