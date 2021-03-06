package tree;

import util.TreeNode;

/**
 * Created by guangshuozang on 8/30/15.
 * Visit every node
 * Time O(N)
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null)
            return true;
        else if(p==null||q==null)
            return false;
        else if(p.val!=q.val)
            return false;
        else
            return isSameTree(p.right,q.right)&&isSameTree(p.left,q.left);
    }
}
