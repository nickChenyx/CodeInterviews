package com.nickchen._02;

/**
 * 面试题12：
 * 打印 1 到最大的 n位数
 * 输入数字 n，按顺序打印出从 1 到最大的 n的十进制数。比如输入3， 打印 1~999
 *
 * @author nickChen
 * @since 2018-01-23 15:25.
 */
public class $12 {

    static void print1ToMaxOfDigits(int n) {
        if (n <= 0) return;
        char[] nums = new char[n];
        for (int i = 0; i < 10; i++) {
            nums[0] = (char) (i + '0');
            recursion(nums, 0);
        }
    }

    private static void recursion(char[] nums, int index) {
        if (index == nums.length-1) {
            printNum(nums);
            return;
        }

        for (int j = 0; j < 10; j++) {
            nums[index+1] = (char) (j+'0');
            recursion(nums, index+1);
        }
    }

    private static void printNum(char[] nums) {
        StringBuilder sb = new StringBuilder();
        //  第一次遇到非0数字后变false
        boolean flag = true;
        for (char c : nums) {
            if (c == '0' && flag) continue;
            else flag = false;
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}

class Test$12 {
    public static void main(String[] args) {
        $12.print1ToMaxOfDigits(0);
    }
}