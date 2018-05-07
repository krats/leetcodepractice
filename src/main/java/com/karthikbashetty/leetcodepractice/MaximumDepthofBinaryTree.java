package com.karthikbashetty.leetcodepractice;

import java.util.Stack;

public class MaximumDepthofBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepthRecursive(TreeNode root) {
        if(root == null) {
            return 0;
        }
        else return Math.max(maxDepthRecursive(root.left), maxDepthRecursive(root.right)) + 1;
    }

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int ans = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (stack.size() != 0) {
            Stack<TreeNode> newStack = new Stack<TreeNode>();
            ans += 1;
            while (stack.size() != 0) {
                TreeNode current = stack.pop();
                if(current.left != null)
                    newStack.push(current.left);
                if(current.right != null)
                    newStack.push(current.right);
            }
            stack = newStack;
        }
        return ans;
    }
}
