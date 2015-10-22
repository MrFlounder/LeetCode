import util.ListNode;

/**
 * Created by guangshuozang on 10/21/15.
 */
public class LinkedList_237 {
    public void deleteNode(ListNode node) {
        while(true){
            if(node.next!=null){
                if(node.next.next==null){
                    node.val=node.next.val;
                    node.next = null;
                    return;
                }
            }
            node.val=node.next.val;
            node = node.next;
        }
    }
}
