package Hashtable;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by guangshuozang on 10/12/15.
 */
public class MinWindowSubString_76 {
    public String minWindow(String S, String T) {

        if (S.length()==0||T.length()==0||S.length()<T.length()) return "";

        int left=T.length(),start=-1,end=S.length();

        Deque<Integer> queue= new LinkedList<Integer>();

        Map<Character,Integer> map= new HashMap<Character,Integer>();// char --- number of same char in T

        for (int i=0;i<T.length();i++){
            char c= T.charAt(i);
            map.put(c,map.containsKey(c)?map.get(c)+1:1);
        }

        for (int i =0;i<S.length();i++){
            char c= S.charAt(i);
            if (!map.containsKey(c))  //if char c is not in T, next loop
                continue;

            int n = map.get(c);
            map.put(c,n-1);
            queue.add(i); // i is the position that c[i] belongs to T
            if (n>0) left--; // when left == 0, found a window

            char head = S.charAt(queue.peek());
            while(map.get(head)<0){
                queue.poll(); // give up the position
                map.put(head,map.get(head)+1); // update map make sure all values >=0
                head=S.charAt(queue.peek());
            }

            if (left==0){
                int new_length=queue.peekLast()-queue.peek()+1;
                if (new_length<end-start) {
                    start=queue.peek();
                    end=queue.peekLast()+1;
                }
            }
        }
        if (left==0)  return S.substring(start,end);
        else return "";
    }
}
