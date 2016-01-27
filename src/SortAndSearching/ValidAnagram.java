package SortAndSearching;

import java.util.Arrays;

/**
 * Created by guangshuozang on 1/25/16.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(ch1.length != ch2.length) return false;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i])
                return false;
        }
        return true;
    }
}
