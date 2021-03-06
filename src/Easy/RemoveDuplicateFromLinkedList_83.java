package Easy;

import util.ListNode;

/**
 * Created by guangshuozang on 9/26/15.
 */
public class RemoveDuplicateFromLinkedList_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while(list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    }
}
