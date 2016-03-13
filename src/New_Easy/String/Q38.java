package New_Easy.String;

/**
 * Created by guangshuozang on 3/12/16.
 */
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.
 */

class Q38 {
    public String countAndSay(int n) {

            String s = Integer.toString(n);
            StringBuilder res = new StringBuilder();
            int cnt = 1;
            for(int i=0;i<s.length();i++){
                if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                    res.append(cnt).append(s.charAt(i));
                    cnt = 1;
                }else cnt ++;
            }
            return res.toString();
    }
        //loop, when string is different from next/no next, reconstructure


    public static void main(String[] args) {
        Q38 ins = new Q38();
        System.out.println(ins.countAndSay(1211));
    }
}
