package tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 10/21/15.
 */
public class BinaryTreePath_257 {
    List<String> list = new ArrayList();
    public List<String> binaryTreePaths(TreeNode root) {
        helper(root, new StringBuilder());
        return list;
    }
    public void helper(TreeNode root, StringBuilder b){
        if(root==null) return;
        b.append(root.val);
        b.append("->");
        if(root.left==null&&root.right==null){
            list.add(b.toString().substring(0,b.toString().length()-2));
            return;
        }
        helper(root.left,new StringBuilder(b));
        helper(root.right,new StringBuilder(b));
    }
}
