

/**
 * Created by guangshuozang on 8/25/15.
 * This is not O(log(m+n))
 */
public class MedianOfTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] both = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,both,0,nums1.length);
        System.arraycopy(nums2,0,both,nums1.length,nums2.length);
        if(both.length%2==0)
            return ((double)(both[both.length/2])+(double)(both[both.length/2+1]))/2;
            return (double)(both[both.length/2]);
    }
}
