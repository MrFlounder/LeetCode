import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by guangshuozang on 8/28/15.
 */
public class TreeSum_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList<>(); //what's the default?
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,h=nums.length-1;
            if (i == 0 || (i > 0 && nums[i] != nums[i-1]))
                while(l<h){
                    if(nums[l]+nums[h]+nums[i]<0)
                        l++;
                    else if(nums[l]+nums[h]+nums[i]>0)
                        h--;
                    else{

                        while (l < h && nums[l] == nums[l+1]) l++;
                        while (l < h && nums[h] == nums[h-1]) h--;
                        res.add(Arrays.asList(nums[i], nums[l], nums[h]));
                        l++;
                        h--;
                    }
                }
        }
        return res;
    }
}
