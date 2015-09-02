import util.ListNode;

import java.util.Stack;

/**
 * Created by guangshuozang on 9/2/15.
 */
public class ReverseNodeKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> stack = new Stack();
        ListNode focusNodeStart = new ListNode(0);
        ListNode focusNodeLoop = head;
        ListNode newListStart = new ListNode(0);
        ListNode newListEnd = newListStart;
        //first loop
        for(int i=0;i<k;i++){
            if(focusNodeLoop==null)
                return head;
            stack.push(focusNodeLoop);
            focusNodeLoop = focusNodeLoop.next;
        }
        while(!stack.empty()){
            newListEnd.next = stack.pop();
            newListEnd = newListEnd.next;
        }
        newListEnd.next = focusNodeLoop;
        head = newListStart.next;
        focusNodeStart.next = head;
        //following loops
        while(focusNodeLoop!=null){
            for(int i=0;i<k;i++){
                if(focusNodeLoop==null)
                    return head;
                stack.push(focusNodeLoop);
                focusNodeLoop = focusNodeLoop.next;
                focusNodeStart = focusNodeStart.next;
            }
            newListEnd = newListStart;
            while(!stack.empty()){
                newListEnd.next = stack.pop();
                newListEnd = newListEnd.next;
            }
            newListEnd.next = focusNodeLoop;
            focusNodeStart.next = newListStart.next;
        }
        return head;
    }
    public static void main(String arg[]){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ReverseNodeKGroup instance = new ReverseNodeKGroup();
        head = instance.reverseKGroup(head,2);
        while(head!=null){
            System.out.println(head);
            head=head.next;
        }
    }
}
