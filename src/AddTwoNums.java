/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode out = null;
        int carry = 0;
        ListNode retur = out;
        //loop
        if(l1!=null&&l2!=null){
            out = new ListNode((l1.val + l2.val + carry)%10);
            retur = out;
            carry = (l1.val + l2.val + carry)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null&&l2!=null){
            out.next = new ListNode((l1.val + l2.val + carry)%10);
            out = out.next;
            carry = (l1.val + l2.val + carry)/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            out.next = new ListNode((l1.val + carry)%10);
            out = out.next;
            carry = (l1.val + carry)/10;
            l1 = l1.next;
        }
        while(l2!=null){
            out.next = new ListNode((l2.val + carry)%10);
            out = out.next;
            carry = (l2.val + carry)/10;
            l2 = l2.next;
        }
        if(carry == 1)
            out.next = new ListNode(carry);
        return retur;
    }
      class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
}