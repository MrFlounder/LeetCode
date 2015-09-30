package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guangshuozang on 9/29/15.
 */
public class Permutation2_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(nums,res,new ArrayList<Integer>(), new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> list, List<Integer> vp){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        int i = 0;
        while(i<nums.length){
            if(vp.contains(i)){
                i++;
                continue;
            }
            list.add(nums[i]);
            vp.add(i);
            helper(nums,res, list, vp);
            list.remove(list.size()-1);
            vp.remove(vp.size()-1);
            i++;
            while(i<nums.length&&nums[i]==nums[i-1]){
                i++;
            }
        }
    }

    public static void main(String arg[]){
        Permutation2_47 ins = new Permutation2_47();
        ins.permuteUnique(new int[]{0,3,-1});
    }
}
