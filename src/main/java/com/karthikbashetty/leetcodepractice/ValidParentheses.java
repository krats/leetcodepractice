package com.karthikbashetty.leetcodepractice;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            } else if (current == '}') {
                if (stack.size() == 0 || stack.peek() != '{') {
                    return false;
                }
                stack.pop();
            } else if (current == ')') {
                if (stack.size() == 0 || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            } else if (current == ']') {
                if (stack.size() == 0 || stack.peek() != '[') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.size() == 0;
    }
}
