package BinarySearch;

import java.util.Arrays;

/**
 * Created by guangshuozang on 10/20/15.
 */
public class TwoSum2_167 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length==0) return null;
        for(int i=0;i<numbers.length;i++){
            int start = i+1, end = numbers.length-1, gap = target-numbers[i];
            while(start<=end){
                int m = start + (end-start)/2;
                if(numbers[m]==gap) return new int[]{i+1,m+1};
                else if(numbers[m]>gap) end = m-1;
                else start = m+1;
            }
        }
        return null;

    }
    public static void main(String arg[]){
        TwoSum2_167 ins = new TwoSum2_167();
        System.out.println(Arrays.toString(ins.twoSum(new int[]{0,0,1,2}, 0)));
    }
}
