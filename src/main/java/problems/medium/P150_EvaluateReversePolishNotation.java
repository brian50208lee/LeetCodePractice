package problems.medium;

import java.util.*;

public class P150_EvaluateReversePolishNotation {
    private static final String ADD = "+";
    private static final String SUB = "-";
    private static final String MUL = "*";
    private static final String DIV = "/";
    private static final Set<String> OPERATORS = new HashSet<>(Arrays.asList(ADD, SUB, MUL, DIV));

    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
                int val2 = stack.pop();
                int val1 = stack.pop();
                switch (token) {
                    case ADD:
                        stack.push(val1 + val2);
                        break;
                    case SUB:
                        stack.push(val1 - val2);
                        break;
                    case MUL:
                        stack.push(val1 * val2);
                        break;
                    case DIV:
                        stack.push(val1 / val2);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return OPERATORS.contains(token);
    }
}
