package problems.structure;


public class Interval {
    public int start;
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof  Interval) {
            Interval object = (Interval) obj;
            return this.start == object.start && this.end == object.end;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return String.format("[%d, %d]", start, end);
    }
}
