/**
 * Created by guangshuozang on 8/30/15.
 */
public class NthNodeFromList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newStart = new ListNode(0);
        ListNode p1 = newStart;
        p1.next = head;
        ListNode p2 = head;
        for(int i=0;i<n;i++){
            p2=p2.next;
        }
        while(p2!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p1.next=p1.next.next;
        return newStart.next;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
