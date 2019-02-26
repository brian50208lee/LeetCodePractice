package problems.medium;

import problems.structure.NestedInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class P341_FlattenNastedListIterator implements Iterator<Integer> {
    private Stack<NestedInteger> stack;

    public P341_FlattenNastedListIterator(List<NestedInteger> nestedList) {
        stack = new Stack<>();
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
        keepStackTopFlatten();
    }

    @Override
    public Integer next() {
        Integer result = stack.pop().getInteger();
        keepStackTopFlatten();
        return result;
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void keepStackTopFlatten() {
        while (!stack.isEmpty() && !stack.peek().isInteger()) {
            List<NestedInteger> list = stack.pop().getList();
            for (int i = list.size() - 1; i >= 0; i--) {
                stack.push(list.get(i));
            }
        }
    }
}

