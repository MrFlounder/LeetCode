package BinarySearch;

/**
 * Created by guangshuozang on 10/20/15.
 */
public class FirstBadVersion_278 {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
    public boolean isBadVersion(int i){}
}
