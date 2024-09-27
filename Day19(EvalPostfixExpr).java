import java.util.*;

class Day19 {
    public static int evaluatePostfix(String expr) {
        int n = expr.length();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = expr.charAt(i);
 
            if (Character.isDigit(c))
                stack.push(c - '0');

            else {

                int v1 = stack.pop();
                int v2 = stack.pop();
 
                switch (c) {

                case '+':
                    stack.push(v2 + v1);
                    break;
                case '-':
                    stack.push(v2 - v1);
                    break;
                case '/':
                    stack.push(v2 / v1);
                    break;
                case '*':
                    stack.push(v2 * v1);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
