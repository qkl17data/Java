package com.learn.leetcode;

/**
 * 回文数
 */
public class IsPalindromeSolution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11211));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length;
        return isPalindrome(s, i, j - 1);
    }

    private static boolean isPalindrome(String s, int i, int j) {
        if (s.charAt(i) == s.charAt(j) && j - i <= 2) {
            return true;
        }
        if (s.charAt(i) == s.charAt(j)) {//012
            return isPalindrome(s, ++i, --j);
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return false;
    }
}
