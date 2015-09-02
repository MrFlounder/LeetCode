package util;

/**
 * Created by guangshuozang on 8/31/15.
 */
public class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
        @Override public String toString(){
            return Integer.toString(this.val);
        }
    }