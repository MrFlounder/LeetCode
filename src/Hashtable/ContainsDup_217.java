package Hashtable;

import java.util.HashSet;

/**
 * Created by guangshuozang on 10/14/15.
 */
public class ContainsDup_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        if(nums.length==0) return false;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }

}
