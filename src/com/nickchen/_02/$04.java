package com.nickchen._02;

/**
 * 面试题4：
 * 把字符串中的每个空格替换成"%20"
 *
 * @author nickChen
 * @since 2018-01-19 15:15.
 */
public class $04 {
    public static String replaceSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

class Test$04 {
    public static void main(String[] args) {
        String s = " hello world !";
        System.out.println($04.replaceSpace(s));
    }
}
