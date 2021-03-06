package tree;

import util.TreeNode;

/**
 * Created by guangshuozang on 10/27/15.
 */
public class BalancedBinaryTree_110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (Math.abs(depth(root.left) - depth(root.right)) >1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int depth(TreeNode root){
        if (root == null)
            return 0;
        return Math.max(depth(root.left), depth(root.right)) + 1;
    }
}
