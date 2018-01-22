package com.nickchen._02;

/**
 * 面试题9：
 * 斐波那契数列
 *
 * @author nickChen
 * @since 2018-01-19 17:20.
 */
public class $09 {

    /**
     * 这是倒序预算， 可以从 0 1 开始加上来，这样就可以少一个 arr 来保存状态
     */
    static long fibonacci(int n, long[] arr) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (arr[n] != 0) {
            System.out.println(n + " : " + arr[n]);
            return arr[n];
        }
        else {
            long res = fibonacci(n-1, arr) + fibonacci(n-2, arr);
            arr[n] = res;
            return res;
        }
    }
}

class Test$09 {
    public static void main(String[] args) {
        long res = $09.fibonacci(10, new long[11]);
        System.out.println(res);
    }
}