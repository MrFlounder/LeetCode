package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guangshuozang on 9/30/15.
 */
public class CombinationSum_39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    helper(res,candidates,target,0,0,new ArrayList<Integer>());
    return res;
}
    public void helper(List<List<Integer>> res, int[] c, int t, int p, int sum, List<Integer> list){
        if(sum==t){

            res.add(new ArrayList<Integer>(list));
            return;
        }
        if(sum>t) return;
        while(p<c.length){
            list.add(c[p]);
            helper(res,c,t,p,sum+c[p],list);
            list.remove(list.size()-1);
            p++;
            while(p<c.length&&c[p]==c[p-1]){
                p++;
            }
        }
    }
}
