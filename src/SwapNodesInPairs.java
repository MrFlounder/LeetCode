import util.ListNode;

/**
 * Created by guangshuozang on 8/31/15.
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode l1 = null, l2 = null;
        while(cur.next != null && cur.next.next != null){
            l1 = cur.next;
            l2 = cur.next.next;
            l1.next = l2.next;
            l2.next = l1;
            cur.next = l2;
            cur = l1;
        }

        return dummy.next;
    }
}
