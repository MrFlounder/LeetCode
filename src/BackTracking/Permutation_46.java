package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 9/27/15.
 */
public class Permutation_46 {
    List<List<Integer>> list;
    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        ArrayList<Integer> perm = new ArrayList<Integer>();
        backTrack(perm,0,nums);
        return list;
    }
    public void backTrack(ArrayList<Integer> perm, int position, int[] nums){
        if(position==nums.length){
            list.add(new ArrayList(perm));
            return;
        }
        for(int j=0;j<position+1;j++){
            perm.add(j,nums[position]);
            backTrack(perm,position+1,nums);
            perm.remove(j);
        }
    }
}
