package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by guangshuozang on 9/27/15.
 * This solution is very slow because it check if the set existing in ArrayList every loop
 */
public class Subsets_2_90 {
    public List<List<Integer>> subsetsWithDup(int[] S) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(S.length == 0){
            return result;
        }
        Arrays.sort(S);
        dfs(S, 0, new ArrayList<Integer>(), result);
        return result;
    }

    public void dfs(int[] s, int index, List<Integer> path, List<List<Integer>> result){
        if(!result.contains(path)){
            result.add(new ArrayList<Integer>(path));
        }
        for(int i = index; i < s.length; i++){
            path.add(s[i]);
            dfs(s, i+1, path, result);
            path.remove(path.size()-1);
        }
    }
}
