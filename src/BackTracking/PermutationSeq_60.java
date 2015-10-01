package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guangshuozang on 9/29/15.
 */
public class PermutationSeq_60 {
    int count = 0;
    public String getPermutation(int n, int k) {
        int f = factorial(n);
        StringBuilder s = new StringBuilder();
        return helper(n, new ArrayList<Integer>(), k, s);

    }
    public String helper(int n, List<Integer> list, int k, StringBuilder s){
        if(list.size()==n){
            count++;
            if(count == k){
                for(int j=0;j<list.size();j++)
                    s.append(list.get(j));
                return s.toString();
            }

        }
        for(int i=1;i<=n;i++){
            if(list.contains(i))
                continue;
            list.add(i);
            String temp = helper(n,list,k, s);
            if(temp!=null)
                return temp;
            list.remove(list.size()-1);
        }
        return null;
    }
    public int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String arg[]){
        PermutationSeq_60 ins = new PermutationSeq_60();
        System.out.println(ins.getPermutation(9, 331987));
    }
}
