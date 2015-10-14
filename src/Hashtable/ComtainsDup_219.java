package Hashtable;

import java.util.Hashtable;

/**
 * Created by guangshuozang on 10/14/15.
 */
public class ComtainsDup_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<2) return false;
        Hashtable<Integer, Integer> table = new Hashtable();
        for(int i=0;i<nums.length;i++){
            if(table.containsKey(nums[i])){
                if(i - table.get(nums[i])<=k)
                    return true;
            }
            table.put(nums[i],i);
        }
        return false;
    }
}
