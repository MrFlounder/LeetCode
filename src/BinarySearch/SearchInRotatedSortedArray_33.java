package BinarySearch;

/**
 * Created by guangshuozang on 10/20/15.
 */
public class SearchInRotatedSortedArray_33 {
    //I'm thinking find the pivot and search the nums then in either side
    //or we can always tell if the target is in the ordered half or not
    public int search(int[] nums, int target) {
        if(nums.length==0) return -1;
        int start = 0, end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target) return mid;
            if(nums[start]<=nums[mid]){
                if(target>=nums[start]&&target<nums[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            if(nums[end]>=nums[mid]){
                if(target>nums[mid]&&target<=nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
}
