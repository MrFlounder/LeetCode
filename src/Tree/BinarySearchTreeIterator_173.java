package tree;

import util.TreeNode;

import java.util.Stack;

/**
 * Created by guangshuozang on 10/27/15.
 */
public class BinarySearchTreeIterator_173 {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    public BinarySearchTreeIterator_173(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        pushAll(temp.right);
        return temp.val;
    }

    public void pushAll(TreeNode root){
        while(root!=null){
            stack.push(root);
            root = root.left;
        }
    }
}
