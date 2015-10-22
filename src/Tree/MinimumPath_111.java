package tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 10/22/15.
 */
public class MinimumPath_111 {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        List<TreeNode> cache = new ArrayList<TreeNode>();
        cache.add(root);
        return BFS(cache, 1);
    }
    public int BFS(List<TreeNode> cache, int level){
        ArrayList<TreeNode> newCache = new ArrayList();
        for(TreeNode n : cache){
            if(n.left==null&&n.right==null) return level;
            if(n.left!=null)
                newCache.add(n.left);
            if(n.right!=null)
                newCache.add(n.right);
        }
        return BFS(newCache, level+1);
    }
}
