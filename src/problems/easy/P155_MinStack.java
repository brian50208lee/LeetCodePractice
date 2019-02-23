package problems.easy;

import java.util.Stack;

public class P155_MinStack {
    private Stack<Integer> stack = new Stack<>();
    private int min = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public P155_MinStack() {

    }

    public void push(int x) {
        stack.push(min);
        stack.push(x);
        min = Math.min(x, min);
    }

    public void pop() {
        stack.pop();
        min = stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
