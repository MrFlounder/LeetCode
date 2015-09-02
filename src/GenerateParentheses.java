import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by guangshuozang on 9/2/15.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {

        List<List<String>> lists = new ArrayList<>();
        lists.add(Collections.singletonList(""));
        for(int i=1;i<n+1;i++){
            ArrayList<String> list = new ArrayList();
            for(int j=0;j<i;j++)
                for(String s:lists.get(j))
                    for(String c:lists.get(i-j-1))
                        list.add("(" + s + ")" + c);
            lists.add(list);
        }
        return lists.get(lists.size() - 1);
    }
}
