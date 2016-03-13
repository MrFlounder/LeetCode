package New_Easy.String;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by guangshuozang on 3/8/16.
 */
public class Q20 {

        private boolean solution(String s){
            HashMap<Character,Character> map = new HashMap<>();
            map.put('(',')');map.put('{','}');map.put('[',']');
            if(s.length()%2!=0) return false;
            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(!stack.empty()&&map.get(stack.peek())==s.charAt(i)) stack.pop();
                else stack.push(s.charAt(i));
            }
            return stack.empty();

        }
        public static void main(String arg[]){
            //case1
            Q20 sl = new Q20();
            System.out.println(sl.solution("[]"));
        }

}
