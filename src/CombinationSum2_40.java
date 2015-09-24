import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by guangshuozang on 9/23/15.
 * This code has error
 */
public class CombinationSum2_40 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<Integer>(), new HashSet(), 0);
        return res;
    }

    private void helper(int[] can, int start, int target,List<Integer> each, HashSet<Integer> set, int level) {
        for (int i = start; i < can.length; i++) {
            List<Integer> temp = new ArrayList<>(each);

            if (can[i] == target) {
                if(set.add(i)){
                    temp.add(can[i]);
                    if(!res.contains(temp))
                        res.add(temp);
                    set.clear();
                    break;
                }
            } else if (can[i] < target) {
                if(set.add(i)){
                    temp.add(can[i]);
                    helper(can, i, target - can[i], new ArrayList<>(temp), set, (level+1));
                }
            } else {
                set.clear();
                break;}
        }
        return;
    }
    public static void main(String arg[]){
        CombinationSum2_40 ins = new CombinationSum2_40();
        ins.combinationSum2(new int[] {2,1,3,1,4}, 10);
    }
}
