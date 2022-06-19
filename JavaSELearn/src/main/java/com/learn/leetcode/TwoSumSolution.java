package com.learn.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
class TwoSumSolution {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] ints = twoSum(arr, 6);
        System.out.println(Arrays.toString(ints));
        int[] intArr = twoSum1(arr, 6);

        System.out.println(Arrays.toString(intArr));
    }

    private static int[] twoSum1(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[]{map.get(target - arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }

    //把值和索引放到哈希表中
    //暴力枚举
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
            if (arr[0] != 0) {
                break;
            }
        }
        return arr;
    }
}