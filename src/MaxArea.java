/**
 * Created by guangshuozang on 8/28/15.
 */
public class MaxArea {
    public int maxArea(int[] height) {
        //pointer start pointer end
        //never move the higher pointer
        int i = 0;
        int max = 0;
        int j = height.length-1;
        while(i<j){
            max = Math.max(max,(j-i)*Math.min(height[i],height[j]));
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}
