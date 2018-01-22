package com.nickchen._02;

/**
 * 面试题10：
 * 二进制中1的个数
 *
 * @author nickChen
 * @since 2018-01-19 17:34.
 */
public class $10 {

    /**
     * 正常解法
     */
    static int countOne(Long num) {
        int count = 0, flag = 1;
        while (flag <= num) {
            if ((num & flag) > 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    /**
     * 更优解法
     */
    static int count(Long num) {
        int count = 0;
        while (num != 0) {
            ++count;
            num = (num-1) & num;
        }
        return count;
    }
}

class Test$10 {
    public static void main(String[] args) {
        int res = $10.count(9L);
        System.out.println(res);
    }
}
