package Easy;

/**
 * Created by guangshuozang on 9/26/15.
 */
public class ClimbingStairs_70 {
    public int climbStairs(int n) {
        if(n==0||n==1) return  1;
        int min1 = 1;
        int min2 = 1;
        int result = 0;
        for(int i=2;i<=n;i++){
            result = min1+min2;
            min1=min2;
            min2=result;
        }
        return result;
    }
}
