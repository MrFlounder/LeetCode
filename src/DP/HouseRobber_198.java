package DP;

/**
 * Created by guangshuozang on 10/16/15.
 */
public class HouseRobber_198 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int maxval = 0;
        int[] maxrob = new int[nums.length];
        int[] maxnotrob = new int[nums.length];
        maxrob[0] = nums[0];
        maxnotrob[0] = 0;
        for(int i=1;i<nums.length;i++){
            maxrob[i] = maxnotrob[i-1]+nums[i];
            maxnotrob[i] = Math.max(maxrob[i-1],maxnotrob[i-1]);
            maxval = Math.max(maxrob[i],maxnotrob[i]);
        }
        return maxval;
    }
}
