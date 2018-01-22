package com.nickchen._02;

/**
 * 面试题3：
 * 在一个数字的二位数组中有如下规则： 行列均从上到下或从左到右增大。
 * 查找给定数字是否存在于数组中。
 *
 * @author nickChen
 * @since 2018-01-19 14:50.
 */
public class $03 {
    public static boolean findInDoubleDimArray(int[][] arr, int num) {
        if (arr == null) return false;
        int x=0, y=0, j=0;
        for (int i = y; i <arr.length; i++) { // 行
            for (j = x; j < arr[i].length; j++) { // 列
                if (arr[i][j] > num) {
                    x = j+1;
                    y = i-1;
                    break;
                } else if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
}

class Test$03 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        for (int i = 0; i < 100; i++) {
            $03.findInDoubleDimArray(arr, i);
//            System.out.println(i + " : " + $03.findInDoubleDimArray(arr, i));
        }
    }
}
