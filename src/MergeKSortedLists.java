import util.ListNode;

/**
 * Created by guangshuozang on 8/31/15.
 * This is unfinished
 * The time complexity is O(N*sortcomplexity)
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode longerList = lists[0];
        boolean[] isEmpty = new boolean[lists.length];

        ListNode temp = new ListNode();
        for(int i=0;i<lists.length;i++){
            //***
            if(lists[i]==null)
                isEmpty[i]=true;
            if(!isEmpty[i]){
                temp = lists[i];
                temp.next = new ListNode();
                temp = temp.next;
                lists[i]=lists[i].next;
            }
            sort();
        }
        return null;
    }
    public void sort(){

    }
}
