package com.nickchen._02;

import java.util.Stack;

/**
 * 面试题7：
 * 请用两个栈实现队列，完成删除头和添加尾两个行为。
 *
 * @author nickChen
 * @since 2018-01-19 16:16.
 */
public class $07 {
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    static Integer deleteHead() {
        if (stack2.empty()) {
            moveStack1ToStack2();
        }
        return stack2.pop();
    }

    static void appendTail(Integer num) {
        stack1.push(num);
    }

    private static void moveStack1ToStack2() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
    }
}

class Test$07 {
    public static void main(String[] args) {
        $07.appendTail(1);
        $07.appendTail(2);
        $07.appendTail(3);
        $07.appendTail(4);
        System.out.println($07.deleteHead());
        System.out.println($07.deleteHead());
        System.out.println($07.deleteHead());
        System.out.println($07.deleteHead());
        System.out.println($07.deleteHead());
    }
}
