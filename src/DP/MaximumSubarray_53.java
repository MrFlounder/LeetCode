package DP;

/**
 * Created by guangshuozang on 10/15/15.
 */
public class MaximumSubarray_53 {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        int sum = nums[0];
        int[] maxsofar = new int[nums.length];
        maxsofar[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            maxsofar[i]=maxsofar[i-1]>0?maxsofar[i-1]+nums[i]:nums[i];
            sum = Math.max(sum,maxsofar[i]);
        }
        return sum;
    }
}
