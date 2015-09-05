import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 9/5/15.
 */
public class SubWithCombWords_30 {
    public List<Integer> findSubstring(String s, String[] words) {
        ArrayList<Integer> list = new ArrayList();
        if(words.length==0) return null;
        for(String st : concatenation(concatenation(words))){
            int temp = strStr(s,st);
            if(temp != -1)
                list.add(temp);
        }
        return list;
    }
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(haystack.equals(needle))
            return 0;
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
    public String[] concatenation(List<String[]> list){
        String[] s = new String[list.size()];
        for(int i=0;i<list.size();i++){
            StringBuilder sb = new StringBuilder();
            for(String l : list.get(i)){
                sb.append(l);
            }
            s[i]=sb.toString();
        }
        return s;
    }

    public List<String[]> concatenation(String[] words){
        List<String[]> list = new ArrayList();


        if(words.length == 1) {
            list.add(words);
            return list;
        }
        else{
            String[] dataSub = new String[words.length - 1];
                for (int i = 0; i < words.length - 1; i++)
                {
                    dataSub[i] = words[i + 1];
                }
                List<String[]> listOld = concatenation(dataSub);

                String newNum = words[0];
                String[] newData = null;
                for (int i = 0; i < listOld.size(); i++)           //遍历每一种原有的组合方式
                {
                    for (int j = 0; j <= listOld.get(i).length; j++)  //遍历组合方式中的每个位置
                    {
                        newData = new String[listOld.get(i).length + 1];
                        newData[j] = newNum;
                        int currentIndex = 0;
                        for (int n = 0; n < listOld.get(i).length; n++)
                        {
                            if (currentIndex == j)
                                currentIndex++;
                            newData[currentIndex] = listOld.get(i)[n];
                            currentIndex++;

                        }
                        list.add(newData);
                    }
                }
            }
        return list;
    }
    public static void main(String arg[]){
        String[] words = {"bar","foo"};
        String s = "barfoothefoobarman";
        SubWithCombWords_30 ins = new SubWithCombWords_30();
        ins.findSubstring(s,words);
    }
}
