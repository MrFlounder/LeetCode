/**
 * Created by guangshuozang on 9/8/15.
 */
public class SearchInsertPostion_35 {
    public int searchInsert(int[] nums, int target) {
        return searchInsert(nums,0,nums.length-1,target);

    }
    public int searchInsert(int[] nums, int start, int end, int target){
        if(start==end||start+1==end){
            if(nums[start]>=target)
                return start;
            else if(nums[end]<target)
                return end+1;
            else return end;
        }


        int mid=(start+end)/2;
        if(nums[mid]==target){
            while(--mid>0){
                if(nums[mid]!=target)
                    break;
            }
            return mid+1;
        }else if(nums[mid]>target)
            return searchInsert(nums,start,mid,target);
        else return searchInsert(nums,mid,end,target);
    }
    public static void main(String arg[]){
        SearchInsertPostion_35 ins = new SearchInsertPostion_35();
        ins.searchInsert(new int[] {1,3}, 3);
    }
}
