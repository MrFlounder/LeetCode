package New_Easy.String;

/**
 * Created by guangshuozang on 3/8/16.
 */
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
 */

class Q165 {
    private int solution(String s1,String s2){
        String[] l1 = s1.split("\\.");
        String[] l2 = s2.split("\\.");
        int length = Math.max(s1.length(),s2.length());

        Integer v1 = 0, v2 = 0;
        for(int i=0;i<length;i++){
            v1 = i<l1.length?Integer.parseInt(l1[i]):0;
            v2 = i<l2.length?Integer.parseInt(l2[i]):0;
            if(v1.compareTo(v2)!=0) return v1.compareTo(v2);
        }
        return 0;
    }
    public static void main(String arg[]){
        //case1
        Solution sl = new Solution();
        //System.out.println(sl.solution("12","12.12"));
    }
}
