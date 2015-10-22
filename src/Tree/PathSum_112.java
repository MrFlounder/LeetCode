package tree;

import util.TreeNode;

/**
 * Created by guangshuozang on 10/22/15.
 */
public class PathSum_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        int res=0;
        return DFS(root,sum,res);
    }
    public boolean DFS(TreeNode root, int sum, int res){
        if(root==null) return false;
        res=res+root.val;
        if(root.left==null&&root.right==null){
            if(res==sum)    return true;
            else return false;
        }
        else{
            return DFS(root.left,sum,res)||DFS(root.right,sum,res);
        }
    }
}
