package tree;

import util.TreeNode;

/**
 * Created by guangshuozang on 10/21/15.
 */
public class ClosestBinarySearchTreeValue_270 {
    public int closestValue(TreeNode root, double target) {
        TreeNode parent = root;
        int res=-1;
        if(root.left==null&&root.right==null) return parent.val;
        if(parent.val==target
                ||(parent.val>target&&parent.left==null)
                ||(parent.val<target&&parent.right==null)
                ||(root.left==null&&root.right==null)) return parent.val;
            //search left
        else if(parent.val>target){
            res = closestValue(parent.left,target);
            //search right
        }else{
            res = closestValue(parent.right,target);
        }
        //return the closest value
        return Math.abs(res-target)>Math.abs(target-parent.val)?parent.val:res;
    }
}
