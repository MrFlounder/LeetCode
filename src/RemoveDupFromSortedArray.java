/**
 * Created by guangshuozang on 8/31/15.
 */
public class RemoveDupFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1])
                nums[count++]=nums[i];
        }
        return count;
    }
}