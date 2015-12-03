package LinkedLIst;

import util.ListNode;

import java.util.Stack;

/**
 * Created by guangshuozang on 12/2/15.
 */
public class ReverseLinkedList_206 {
//    public ListNode reverseList(ListNode head) {
//        Stack<ListNode> stack = new Stack();
//        ListNode r = new ListNode(0);
//        while(head != null){
//            stack.push(head);
//            head = head.next;
//        }
//        ListNode focus = r;
//        while(!stack.empty()){
//            focus.next = stack.pop();
//            focus = focus.next;
//        }
//
//        return r.next;
//    }
public ListNode reverseList(ListNode head) {
    Stack<Integer> stack = new Stack();
    ListNode r = new ListNode(0);
    while(head != null){
        stack.push(head.val);
        head = head.next;
    }
    ListNode focus = r;
    while(!stack.empty()){
        focus.next = new ListNode(stack.pop());
        focus = focus.next;
    }
    return r.next;
}
}
