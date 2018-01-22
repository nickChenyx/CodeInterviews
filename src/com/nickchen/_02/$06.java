package com.nickchen._02;

import java.util.Arrays;

/**
 * 面试题6：
 * 根据某二叉树的前序遍历和中序遍历的结果，重建出二叉树。假设输入的前序遍历和中序遍历都不含重复数字。
 *
 * @author nickChen
 * @since 2018-01-19 15:28.
 */
public class $06 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode buildTree(int[] pre, int[] in) {
        if (pre == null || pre.length == 0) return null;
        int root = pre[0];
        int rootIndex = findElementIndex(in, root);
        if (rootIndex == 0 && in.length == 1) return new TreeNode(root);
        TreeNode r = new TreeNode(root);
        r.left = buildTree(Arrays.copyOfRange(pre, 1, rootIndex+1), Arrays.copyOfRange(in, 0, rootIndex));
        r.right = buildTree(Arrays.copyOfRange(pre, rootIndex+1, pre.length), Arrays.copyOfRange(in, rootIndex+1, in.length));
        return r;
    }

    private static int findElementIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) return i;
        }
        return -1;
    }
}

class Test$06 {
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        $06.TreeNode root = $06.buildTree(pre, in);
        System.out.println(root);
    }
}
