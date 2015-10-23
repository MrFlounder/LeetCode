package tree;

import java.util.Stack;

/**
 * Created by guangshuozang on 10/22/15.
 */
public class VerifyPreorderSeqInBST_255 {
    public boolean verifyPreorder(int[] preorder) {
        Stack<Integer> path = new Stack();
        int low = Integer.MIN_VALUE;
        if(preorder.length<2) return true;
        path.push(preorder[0]);
        for (int i=1;i<preorder.length;i++) {
            if(preorder[i-1]>preorder[i]){
                if(preorder[i]<low) return false;
                path.push(preorder[i]);
            }
            else{
                while (!path.empty() && preorder[i] > path.peek())
                    low = path.pop();
                path.push(preorder[i]);
            }
        }
        return true;
    }
}
