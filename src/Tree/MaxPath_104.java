package tree;

import util.TreeNode;

/**
 * Created by guangshuozang on 10/22/15.
 */
public class MaxPath_104 {
    public int maxDepth(TreeNode root) {
        int sum = 0;
        return maxDepth(root, sum);
    }
    public int maxDepth(TreeNode root, int sum){
        if(root==null) return sum;
        sum = sum +1;
        return Math.max(maxDepth(root.left,sum),maxDepth(root.right,sum));
    }
}
