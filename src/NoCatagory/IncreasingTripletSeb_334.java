package NoCatagory;

/**
 * Created by guangshuozang on 2/28/16.
 */
public class IncreasingTripletSeb_334 {
    public boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3) return false;
        int min = Integer.MAX_VALUE, max = Integer.MAX_VALUE;
        int i = 0;

        while(i < nums.length) {
            if(nums[i] > max) {
                return true;
            } else if(nums[i] > min) {
                max = nums[i];
            } else {
                min = nums[i];
            }
            i++;
        }
        return false;

    }
}
