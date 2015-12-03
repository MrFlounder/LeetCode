package Tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kzang on 11/19/2015.
 */
public class RightSideView_199 {
    public List<Integer> rightSideView(TreeNode root) {
        /*Idea: 1.Each depth of the tree only select one node.
2. View depth is current size of result list.*/
        List<Integer> res = new ArrayList();
        rightSideView(res, 0, root);
        return res;

    }
    public void rightSideView(List<Integer> res, int dep, TreeNode root){
        if(root == null) return;
        if(dep == res.size()){
            res.add(root.val);
        }
        rightSideView(res, dep+1, root.right);
        rightSideView(res, dep+1, root.left);
    }
}
