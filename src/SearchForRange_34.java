/**
 * Created by guangshuozang on 9/7/15.
 */
public class SearchForRange_34 {

    public int[] searchRange(int[] nums, int target) {
        int position = f(nums,0,nums.length-1,target);
        if(position == -1)
            return new int[] {-1,-1};
        else{
            int start = position;
            while(--start>=0){
                if(nums[start]!=target){
                    break;
                }
            }
            int end = position;
            while(++end<=nums.length-1){
                if(nums[end]!=target){
                    break;
                }
            }
            return new int[] {start+1,end-1};
        }
    }
    public int f(int[] nums,int start, int end, int target){
        if(start == end || end == start +1)
            if(nums[end]==target)
                return end;
            else if(nums[start]==target)
                return start;
            else return -1;
        int mid = (start+end)/2;
        if(nums[mid]<target)
            return f(nums,mid,end,target);
        else if(nums[mid]>target)
            return f(nums,start,mid,target);
        else
            return mid;
    }

    public static void main(String arg[]){
        SearchForRange_34 ins = new SearchForRange_34();
        ins.searchRange(new int[] {1,2,3}, 1);
    }

}
