package Hashtable;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by guangshuozang on 10/14/15.
 */
public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> table = new Hashtable<Character, Character>();
        //HashMap<Character, Character> table = new HashMap<Character, Character>();
        if(s.length()!=t.length())
            return false;

        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(table.containsKey(a)) {
                if (!table.get(a).equals(b))
                    return false;
            }
            else{
                if(table.containsValue(b))
                    return false;
                table.put(a,b);
            }
        }
        return true;
    }
    public static void main(String arg[]){
        IsomorphicStrings_205 ins = new IsomorphicStrings_205();
        ins.isIsomorphic("aba","baa");
    }
}
