package SortAndSearching;

/**
 * Created by guangshuozang on 1/25/16.
 */
public class WiggleSort {

        public void wiggleSort(int[] nums) {
            for(int i=0;i<nums.length;i++)
                if(i%2==1){
                    if(nums[i-1]>nums[i]) swap(nums, i);
                }else if(i!=0 && nums[i-1]<nums[i]) swap(nums, i);
        }
        public void swap(int[] nums, int i){
            int tmp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=tmp;
        }
        public static void main(String arg[]){
            int[] nums = new int[] {6, 10, 4, 2, 3, 8};
            System.out.println(nums);
            WiggleSort ins = new WiggleSort();
            ins.wiggleSort(nums);
            System.out.println(nums);
        }
}
