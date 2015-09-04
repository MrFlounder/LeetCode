/**
 * Created by guangshuozang on 9/2/15.
 */
public class DivideTwoIntLoopSolution_29 {
    public int divide(int dividend, int divisor) {
        if(divisor==0)
            return Integer.MAX_VALUE;
        int remain = Math.abs(dividend);
        int d = Math.abs(divisor);
        int count=0;

        while(remain>=divisor){
            remain=remain-d;
            count++;
            if(count>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }

        if((dividend>=0&&divisor>0)||(dividend<0&&divisor<0))
            return count;
        else
            return count+0x8000;

    }
    public static void main(String arg[]){
        int n = 2147483647;
        DivideTwoIntLoopSolution_29 ins = new DivideTwoIntLoopSolution_29();
        System.out.println(ins.divide(n,1));
    }
}
