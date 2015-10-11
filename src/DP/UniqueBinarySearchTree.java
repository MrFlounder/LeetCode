package DP;

import java.util.Arrays;

/**
 * Created by guangshuozang on 10/10/15.
 */
public class UniqueBinarySearchTree {
    public int numTrees(int n) {
        int[] sum = new int[n];
        Arrays.fill(sum, 0);
        for(int i=1;i<=n;i++){
            sum[n] = sum[n] + numTrees2(n-i,sum)*numTrees2(i-1,sum);
        }
        return sum[n];
    }
    public int numTrees2(int n, int[] sum){
        if(n==0)
            return 1;
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(sum[n]!=0)
            return sum[n];
        for(int i=1;i<=n;i++){
            sum[n] = sum[n] + numTrees2(n-i,sum)*numTrees2(i-1,sum);
        }
        return sum[n];
    }
}
