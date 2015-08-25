import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by guangshuozang on 8/24/15.
 * Time complexity would be O(N^2)
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        int[] temp = {0,0};
        while(i<nums.length){
            j=i+1;
            while(j<nums.length){
                if((nums[j]+nums[i])==target){
                        temp[0] = i + 1;
                        temp[1] = j + 1;
                        return temp;
                }
                j++;
            }
            i++;
        }
        //meaning not found
        return temp;
    }
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int[] numbers = {1,2,3,12,43,5};
        TwoSum instance = new TwoSum();
        while(true) {
            int target = in.nextInt();
            System.out.println(Arrays.toString(instance.twoSum(numbers, target)));
        }
    }
}

