package Hashtable;

/**
 * Created by guangshuozang on 10/12/15.
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            result= result^nums[i];  /* Get the xor of all elements */
        }
        return result;
    }
}
