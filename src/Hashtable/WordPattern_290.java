package Hashtable;

import java.util.Hashtable;

/**
 * Created by guangshuozang on 10/12/15.
 */
public class WordPattern_290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Hashtable<Character,String> table = new Hashtable<Character,String>();
        for(int i=0;i<pattern.length();i++){
            if(table.containsKey(pattern.charAt(i))){
                if(!table.get(pattern.charAt(i)).equals(words[i]))
                    return false;
            }else if(table.containsValue(words[i]))
                return false;
            else
                table.put(pattern.charAt(i),words[i]);
        }
        return true;
    }
    public static void main(String arg[]){
        WordPattern_290 ins = new WordPattern_290();
        ins.wordPattern("abba","dog cat cat dog");
    }
}
