package problems.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P227_BasicCalculatorII {
    // TODO need to improve
    public int calculate(String s) {
        s = s.replaceAll("\\s+", "");
        if (s.length() == 0) {
            return 0;
        }

        List<String> infix = parseInfix(s);
        List<String> postfix = intfixToPostfix(infix);
        return evaluatePostfix(postfix);
    }

    private List<String> parseInfix(String s) {
        List<String> infix = new ArrayList<>();
        Integer num = null;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (num == null) {
                    num = 0;
                }
                num = num * 10 + (c - '0');
            } else { // c is operator
                if (num == null) {
                    num = 0;
                }
                infix.add(Integer.toString(num));
                infix.add(Character.toString(c));
                num = null;
            }
        }
        if (num != null) {
            infix.add(Integer.toString(num));
        }
        return infix;
    }

    private List<String> intfixToPostfix(List<String> infix) {
        List<String> postfix = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        for (String element : infix) {
            if (isOperator(element)) {
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(element)) {
                    postfix.add(stack.pop());
                }
                stack.push(element);
            } else {
                postfix.add(element);
            }
        }

        while (!stack.isEmpty()) {
            postfix.add(stack.pop());
        }

        return postfix;
    }

    private int evaluatePostfix(List<String> postfix) {
        Stack<Integer> stack = new Stack<>();
        for (String element : postfix) {
            if (isOperator(element)) {
                int rightVal = stack.pop();
                int leftVal = stack.pop();
                switch (element) {
                    case "+":
                        stack.push(leftVal + rightVal);
                        break;
                    case "-":
                        stack.push(leftVal - rightVal);
                        break;
                    case "*":
                        stack.push(leftVal * rightVal);
                        break;
                    case "/":
                        stack.push(leftVal / rightVal);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(element));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String s) {
        return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
    }

    private int priority(String s) {
        if ("*".equals(s) || "/".equals(s)) {
            return 2;
        }
        if ("+".equals(s) || "-".equals(s)) {
            return 1;
        }
        return 0;
    }
}
