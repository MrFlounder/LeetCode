package tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by guangshuozang on 10/27/15.
 */
public class BinaryTreeLevelOrderTraversal2_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> container = new ArrayList<List<Integer>>();
        if (root == null) return container;
        TreeNode cur = null;
        Queue<TreeNode> sameLevel = new LinkedList<TreeNode>();
        sameLevel.add(root);
        while (!sameLevel.isEmpty()) {
            List<Integer> oneLevel = new ArrayList<Integer>();
            Queue<TreeNode> temp = new LinkedList<TreeNode>();
            while(!sameLevel.isEmpty()) {
                cur = sameLevel.remove();
                oneLevel.add(cur.val);
                if (cur.left != null)  temp.add(cur.left);
                if (cur.right != null) temp.add(cur.right);
            }
            container.add(0,oneLevel);
            sameLevel = temp;
        }
        return container;
    }
}
