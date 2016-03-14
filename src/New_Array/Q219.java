package New_Array;

import tree.LargestBSTSubtree_333;

import java.util.HashSet;

/**
 * Created by guangshuozang on 3/13/16.
 */
public class Q219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Q219 ins = new Q219();
        System.out.println(ins.containsNearbyDuplicate(new int[]{1,2,3,2},3));
    }
}
