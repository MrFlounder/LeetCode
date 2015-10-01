package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 10/1/15.
 */
public class CombinationSum3_216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res,n,k,1,new ArrayList<Integer>(),0);
        return res;
    }
    public void helper(List<List<Integer>> res, int n, int k, int i, List<Integer> list, int sum){
        if(list.size()>k||sum>n) return;
        if(list.size()==k&&sum==n){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        while(i<=9&&9-i+1+list.size()>=k){
            list.add(i);
            helper(res,n,k,i+1,list,sum+i);
            list.remove(list.size()-1);
            i++;
        }
    }
}
