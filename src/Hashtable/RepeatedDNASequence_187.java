package Hashtable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by guangshuozang on 10/12/15.
 */
public class RepeatedDNASequence_187 {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> firstTime = new HashSet<Integer>();
        Set<Integer> secondTime = new HashSet<Integer>();
        List<String> list = new ArrayList<String>();

        for(int i=0; i<= s.length() - 10; i++)
        {
            int sequence = encoding(s.substring(i, i+10));

            if(!firstTime.add(sequence) && secondTime.add(sequence))
            {
                list.add(s.substring(i, i+10));
            }
        }

        return list;
    }

    public int encoding(String s){
        char[] map = new char[26];
        int r = 0; // 32 bit int can represent 16 encoded chars
        if(s.length() != 10) return -1;
        map['A' - 'A'] = 0; // A = 00
        map['C' - 'A'] = 1; // C = 01
        map['G' - 'A'] = 2; // G = 10
        map['T' - 'A'] = 3; // T = 11
        for (int i=0; i<s.length(); i++){
            int temp = map[s.charAt(i) - 'A'];
            r = r<<2;
            r = r|temp;
        }
        return r;
    }
}
