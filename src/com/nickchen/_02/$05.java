package com.nickchen._02;

/**
 * 面试题5：
 * 从尾到头打印链表
 *
 * @author nickChen
 * @since 2018-01-19 15:20.
 */
public class $05 {

    static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    public static void printLinkedListDesc(Node head) {
        if (head.next == null) {
            System.out.println(head.val);
        } else {
            printLinkedListDesc(head.next);
            System.out.println(head.val);
        }
    }
}

class Test$05 {
    public static void main(String[] args) {
        $05.Node n1 = new $05.Node(1);
        $05.Node n2 = new $05.Node(2);
        $05.Node n3 = new $05.Node(3);
        $05.Node n4 = new $05.Node(4);
        n1.next = n2; n2.next = n3; n3.next = n4;

        $05.printLinkedListDesc(n1);
    }
}
