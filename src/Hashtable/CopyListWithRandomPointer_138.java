package Hashtable;

import util.RandomListNode;

/**
 * Created by guangshuozang on 10/14/15.
 */
public class CopyListWithRandomPointer_138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null) return head;
        RandomListNode f = head;
        RandomListNode xHead = new RandomListNode(0);
        RandomListNode x = new RandomListNode(0);
        xHead.next = x;
        //Step1: Copy as if A is regular linked list ==> Get entire list B ready ahead of time
        while(f!=null){
            x.label = f.label;
            f = f.next;
            if(f!=null){
                x.next = new RandomListNode(0);
                x = x.next;
            }
        }
        //Step2: Set all the random pointers
        f = head;
        x = xHead.next;
        while(f!=null){
            x.random = f.random == null? null:new RandomListNode(f.random.label);
            f = f.next;
            x = x.next;
        }
        return xHead.next;
    }
}
