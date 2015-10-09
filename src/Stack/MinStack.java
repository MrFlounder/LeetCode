package Stack;

/**
 * Created by guangshuozang on 10/8/15.
 */
class MinStack {
    Node head = null;
    public void push(int x) {
        if(head == null){
            this.head = new Node(x);
            head.min = x;
        }
        else{
            Node temp = new Node(x);
            if(x<head.min)
                temp.min=x;
            else
                temp.min=head.min;
            temp.next = head;
            head = temp;
        }

    }

    public void pop() {
        if(head==null)
            return;
        else
            head = head.next;
    }

    public int top() {
        if(head==null)
            return Integer.MAX_VALUE;
        return head.val;
    }

    public int getMin() {
        if(head==null)
            return Integer.MAX_VALUE;
        return head.min;
    }

    class Node{
        int val;
        int min;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
}
