package src.stack;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c=='(') {
                stack.push(')');
            } else if(c=='{') {
                stack.push('}');
            } else if(c=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /*
    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
    for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                charStack.push(c);
            } else {
                if (charStack.isEmpty()) {
                    return false;
                }
                char top = charStack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
     */

    public static void main(String[] args) {
        System.out.println("Is containing Valid Parenthesis "+isValid("(])]{"));
    }
}
