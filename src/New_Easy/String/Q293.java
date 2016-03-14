package New_Easy.String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 3/13/16.
 */
public class Q293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> r = new ArrayList<>();
        int index = 0;
        String res = null;
        while(index<s.length()-1){
            index = s.substring(index).indexOf("++") + index;
            res = s.substring(0,index)+"--"+s.substring(index+2);
            r.add(res);
            index ++;
        }
        return r;
    }

        public static void main(String[] args) {
            Q293 ins = new Q293();
            System.out.println(ins.generatePossibleNextMoves("++++"));
        }
    }

