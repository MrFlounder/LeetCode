package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 9/29/15.
 */
public class PermutationS2_46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(nums,res,new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> list){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            helper(nums,res,list);
            list.remove(list.size()-1);
        }
    }
}
