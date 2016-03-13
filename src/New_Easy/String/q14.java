package New_Easy.String;
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.

 Write a function to find the longest common prefix string amongst an array of strings.
 */

class Solution {
    private String commonPrefix(String[] strs){
        if(strs == null || strs.length==0) return "";
        StringBuilder res = new StringBuilder();
        res.append(strs[0]);
        int i = 0;
        while(i<strs.length){
            while(strs[i].indexOf(res.toString())!=0)
                res.deleteCharAt(res.length()-1);
            i++;
        }
        return res.toString();
    }
    public static void main(String arg[]){
        //case1
        Solution instance = new Solution();
        System.out.println(instance.commonPrefix(new String[] {"string1", "str2"}));
    }
}

/**
 * Created by guangshuozang on 3/8/16.
 */

