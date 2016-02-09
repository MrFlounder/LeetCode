package Design;

import util.TreeNode;

import java.util.Stack;

/**
 * Created by guangshuozang on 2/8/16.
 */
public class BinarySearchTreeIterator_173 {
    private Stack<TreeNode> stack = new Stack<TreeNode>();

    public BinarySearchTreeIterator_173(TreeNode root) {
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmpNode = stack.pop();
        pushAll(tmpNode.right);
        return tmpNode.val;
    }

    private void pushAll(TreeNode node) {
        for (; node != null; stack.push(node), node = node.left);
    }
}
