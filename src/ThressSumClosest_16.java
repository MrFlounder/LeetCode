import java.util.Arrays;

/**
 * Created by guangshuozang on 8/29/15.
 */
public class ThressSumClosest_16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[nums.length-1];
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,h=nums.length-1;
            while(l<h){
                if(nums[i]+nums[l]+nums[h]-target<0){
                    closest=Math.abs(closest-target)<Math.abs(nums[i]+nums[l]+nums[h]-target)?closest:nums[i]+nums[l]+nums[h];
                    l++;
                }
                else if(nums[i]+nums[l]+nums[h]-target>0){
                    closest=Math.abs(closest-target)<Math.abs(nums[i]+nums[l]+nums[h]-target)?closest:nums[i]+nums[l]+nums[h];
                    h--;
                }
                else
                    return (nums[i]+nums[l]+nums[h]);
            }
        }
        return closest;
    }
}
