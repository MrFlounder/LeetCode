package tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 10/22/15.
 */
public class PathSum2_113 {
    List<List<Integer>> rlist = new ArrayList<List<Integer>>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        int res=0;
        DFS(root,sum,res,new ArrayList<Integer>());
        return rlist;
    }
    public void DFS(TreeNode root, int sum, int res,List<Integer> list){
        if(root==null) return;
        res=res+root.val;
        list.add(root.val);
        if(root.left==null&&root.right==null){
            if(res==sum)    rlist.add(list);
        }
        else{
            DFS(root.left,sum,res,new ArrayList(list));
            DFS(root.right,sum,res,new ArrayList(list));
        }
    }
}
