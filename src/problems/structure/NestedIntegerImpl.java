package problems.structure;

import java.util.List;

public class NestedIntegerImpl implements NestedInteger{
    private Integer integer = null;
    private List<NestedInteger> list = null;

    public NestedIntegerImpl(Integer integer) {
        this.integer = integer;
    }

    public NestedIntegerImpl(List<NestedInteger> list) {
        this.list = list;
    }

    @Override
    public boolean isInteger() {
        return integer != null;
    }

    @Override
    public Integer getInteger() {
        return integer;
    }

    @Override
    public List<NestedInteger> getList() {
        return list;
    }
}
