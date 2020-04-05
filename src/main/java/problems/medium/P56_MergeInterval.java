package problems.medium;

import problems.structure.Interval;

import java.util.ArrayList;
import java.util.List;

public class P56_MergeInterval {
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() == 0) {
            return intervals;
        }

        List<Interval> results = new ArrayList<>();
        for (int i = 0; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (results.size() == 0) {
                results.add(interval);
            } else {
                boolean addToResults = true;
                for (int j = 0; j < results.size(); j++) {
                    Interval candidate = results.get(j);
                    if (isOverlape(candidate, interval)) {
                        results.remove(j);
                        intervals.add(mergeInterval(candidate, interval));
                        addToResults = false;
                        break;
                    }
                }
                if (addToResults) {
                    results.add(interval);
                }
            }
        }

        return results;
    }

    private boolean isOverlape(Interval i1, Interval i2) {
        Interval left, right;
        if (i1.start < i2.start) {
            left = i1;
            right = i2;
        } else {
            left = i2;
            right = i1;
        }
        if (left.end >= right.start) {
            return true;
        } else {
            return false;
        }
    }

    private Interval mergeInterval(Interval i1, Interval i2) {
        return new Interval(Math.min(i1.start, i2.start), Math.max(i1.end, i2.end));
    }
}
