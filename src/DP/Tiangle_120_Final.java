package DP;

import java.util.List;

/**
 * Created by guangshuozang on 10/17/15.
 */
public class Tiangle_120_Final {
    public int minimumTotal(List<List<Integer>> triangle) {

        if(triangle==null||triangle.isEmpty()) return 0;
        final int height=triangle.size();
        int[] mins = new int[height];
        for(int i=0;i<height;i++){
            mins[i]=triangle.get(height-1).get(i);
        }

        for(int i=height-1;i>0;i--){
            for(int j=0;j<i;j++){
                mins[j]=Math.min(mins[j+1],mins[j])+triangle.get(i-1).get(j);
            }
        }
        return mins[0];

    }
}
