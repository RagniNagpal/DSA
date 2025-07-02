package july2;

import java.util.Stack;

public class PostfixToInfix {

    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    static String toInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                // If operand, push to stack
                stack.push(Character.toString(ch));
            } else if (isOperator(ch)) {
                // Pop top two for operator
                String op2 = stack.pop();
                String op1 = stack.pop();
                String expr = "(" + op1 + ch + op2 + ")";
                stack.push(expr);
            }
        }

        // Final result
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "ABC^+D*E5^+";
        System.out.println("Postfix: " + postfix);
        String infix = toInfix(postfix);
        System.out.println("Infix  : " + infix);
    }
}


