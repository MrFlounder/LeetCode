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
Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".

a    11
b     1
-------
     10
c    1
    100
No need to worry about overhead
 */

class q67 {
    private String solution(String s1, String s2){
        StringBuilder res = new StringBuilder();
        int i = s1.length()-1, j = s2.length()-1;
        int t1, t2, c=0;
        while(i>=0||j>=0){
            t1=Character.getNumericValue(i>=0?s1.charAt(i--):'0');
            t2=Character.getNumericValue(j>=0?s2.charAt(j--):'0');
            res.append(t1^t2^c);
            c = (t1 + t2 + c) > 1?1:0;
        }
        if(c>0)
            res.append(c);
        return res.reverse().toString();

    }
    public static void main(String arg[]){
        //case1
        q67 sl = new q67();
        System.out.println(sl.solution("111", "1"));
    }
}
