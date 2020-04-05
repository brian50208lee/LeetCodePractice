package problems.easy;

import java.util.HashMap;
import java.util.Stack;

public class P20_ValidParentheses {
    private Stack<Character> stack;
    private static final HashMap<Character, Character> leftToRightParentheses;

    static {
        leftToRightParentheses = new HashMap<>();
        leftToRightParentheses.put('(', ')');
        leftToRightParentheses.put('[', ']');
        leftToRightParentheses.put('{', '}');
    }

    public boolean isValid(String s) {
        stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (isLeftParentheses(c)) {
                stack.push(c);
            } else if (matchInStack(c)) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isLeftParentheses(char c) {
        return leftToRightParentheses.keySet().contains(c);
    }

    private boolean matchInStack(char c) {
        if (stack.isEmpty()) {
            return false;
        }

        char peekChar = stack.peek();
        char peekParentheses = leftToRightParentheses.get(peekChar);
        if (peekParentheses == c) {
            return true;
        } else {
            return false;
        }
    }
}
