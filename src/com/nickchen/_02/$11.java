package com.nickchen._02;

/**
 * 面试题11：
 * 数值的整数次方
 *
 * @author nickChen
 * @since 2018-01-23 14:53.
 */
public class $11 {
    static double Power(double base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        boolean positive = true;
        if (exponent < 0) positive = false;
        double res = PowerWithUnsigned(base, exponent > 0 ? exponent : -exponent);
        return positive ? res : 1 / res;
    }

    /**
     * An =  {
     * A * An-1      if n % 2 != 0
     * An/2 * An/2   if n % 2 == 0
     * }
     */
    private static double PowerWithUnsigned(double base, int exponent) {
        if (exponent == 1) {
            return base;
        }
        if ((exponent & 0x1) == 1) {
            return base * PowerWithUnsigned(base, exponent - 1);
        } else {
            double res = PowerWithUnsigned(base, exponent >> 1);
            return res * res;
        }
    }
}

class Test$11 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = -4; j < 0; j++) {
                System.out.println(i + " * " + j + " = " + $11.Power(i, j));
            }
        }
    }
}
