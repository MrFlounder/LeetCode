/**
 * Created by guangshuozang on 8/30/15.
 */
public class MergeTwoSortedList_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode start = result;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                result.next = new ListNode(l1.val);
                result = result.next;
                l1=l1.next;
            }else{
                result.next = new ListNode(l2.val);
                result = result.next;
                l2=l2.next;
            }
        }
        while(l1!=null){
            result.next = new ListNode(l1.val);
            result = result.next;
            l1=l1.next;
        }
        while(l2!=null){
            result.next = new ListNode(l2.val);
            result = result.next;
            l2=l2.next;
        }
        return start.next;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
