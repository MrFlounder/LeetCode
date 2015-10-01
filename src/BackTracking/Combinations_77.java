package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 9/30/15.
 */
public class Combinations_77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        helper(res,n,k,1,new ArrayList<Integer>());
        return res;
    }
    public void helper(List<List<Integer>> res, int n, int k, int i, List<Integer> list){
        if(list.size()==k){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        while(i<=n&&n-i+1+list.size()>=k){
            list.add(i);
            helper(res,n,k,i+1,list);
            list.remove(list.size()-1);
            i++;
        }
    }
    public static void main(String arg[]){
        Combinations_77 ins = new Combinations_77();
        System.out.println(ins.combine(2,2));
    }
}
