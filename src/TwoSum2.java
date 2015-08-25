import java.util.*;

/**
 * Created by guangshuozang on 8/24/15.
 */
public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        int[] temp = {0,0};
        for(int i = 0; i < nums.length; i++) {
                if (table.containsKey(target - nums[i])) {
                    temp[1] = i + 1;
                    temp[0] = table.get(target - nums[i]);
                    return temp;
                }

                table.put(nums[i], i + 1);
        }
    return temp;
}
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int[] numbers = {0,1,2,0};
        TwoSum2 instance = new TwoSum2();
        while(true) {
            int target = in.nextInt();
            System.out.println(Arrays.toString(instance.twoSum(numbers, target)));
        }
    }
}
