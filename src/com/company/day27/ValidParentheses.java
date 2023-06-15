package com.company.day27;

import java.util.Stack;

public class ValidParentheses {
    /**
     *    ( ) [ ] { }
     *  ({
     *
     * @param args
     */



    public static void main(String[] args) {

        String  s = "((())[]{}[])";
        System.out.println(checkParentheses(s));
    }

    public static boolean checkParentheses(String s){
        Stack<Character> stack = new Stack<Character>();

        for (Character each : s.toCharArray()) {
                if (each.equals('(') || each.equals('{') ||each.equals('['))
                    stack.push(each);
                else if(each.equals(')') && stack.peek().equals('('))
                    stack.pop();
                else if (each.equals('}') && stack.peek().equals('{'))
                    stack.pop();
                else if (each.equals(']') && stack.peek().equals('['))
                    stack.pop();
        }
            return  stack.empty();
    }
}
