import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Created by guangshuozang on 8/29/15.
 */
public class LetterCombination_17 {
    public List<String> letterCombinations(String digits) {
        String[] charmap = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        // LinkedList<String> result = new LinkedList<String>();
        // result.addLast(null);
        Vector<String> result = new Vector();
        if(digits.length()==0)
            return result;
        String x = "";
        result.add(x);

        for(int i=0;i<digits.length();i++){
            Vector<String> temp = new Vector();
            String s = charmap[digits.charAt(i)-'0'];
            for(int j=0;j<s.length();j++)
                for(int k=0;k<result.size();k++){
                    temp.add(result.get(k) + s.charAt(j));
                }
            result = temp;
        }
        return result;

    }
}
