package BinarySearch;

/**
 * Created by guangshuozang on 10/20/15.
 */
public class Pow_50 {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==1) return x;
        if(n==-1) return 1/x;
        if(n<0){
            x=1/x;
            n=-n;
        }
        return n%2==0?myPow(x*x, n/2):x*myPow(x*x,n/2);
    }
}
