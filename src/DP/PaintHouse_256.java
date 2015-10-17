package DP;

/**
 * Created by guangshuozang on 10/16/15.
 */
public class PaintHouse_256 {
    public int minCost(int[][] costs) {
        if(costs.length==0) return 0;
        int[][] maxsofar = new int[costs.length][costs[0].length];
        maxsofar[0][0] = costs[0][0];
        maxsofar[0][1] = costs[0][1];
        maxsofar[0][2] = costs[0][2];
        for(int i=1;i<costs.length;i++){
            int a = Math.min(maxsofar[i-1][0],maxsofar[i-1][1]);
            int b = Math.min(maxsofar[i-1][0],maxsofar[i-1][2]);
            int c = Math.min(maxsofar[i-1][2],maxsofar[i-1][1]);
            maxsofar[i][0] = costs[i][0]+c;
            maxsofar[i][1] = costs[i][1]+b;
            maxsofar[i][2] = costs[i][2]+a;
        }
        return Math.min(Math.min(maxsofar[costs.length-1][0],maxsofar[costs.length-1][1]),maxsofar[costs.length-1][2]);
    }
}
