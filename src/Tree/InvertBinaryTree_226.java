package tree;

import util.TreeNode;

/**
 * Created by guangshuozang on 10/23/15.
 */
public class InvertBinaryTree_226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
