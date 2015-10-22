import sun.jvm.hotspot.utilities.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by guangshuozang on 10/21/15.
 */
public class Sort_252 {
    private boolean canAttendMeetings(Interval[] intervals) {
        try {
            Arrays.sort(intervals, new IntervalComparator());
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval o1, Interval o2) {
            if (o1.start < o2.start && o1.end <= o2.start)
                return -1;
            else if (o1.start > o2.start && o1.start >= o2.end)
                return 1;
            throw new RuntimeException();
        }
    }
    public class Interval {
             int start;
             int end;
             Interval() { start = 0; end = 0; }
             Interval(int s, int e) { start = s; end = e; }
         }
}
