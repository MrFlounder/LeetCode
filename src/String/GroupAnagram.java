package String;

import java.util.*;

/**
 * Created by guangshuozang on 10/10/15.
 */
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            // tip: char array to String --> String.valueOf(myarray);
            String newString = String.valueOf(ch);
            if (map.containsKey(newString)) {
                map.get(newString).add(strs[i]);
            } else {
                List<String> each = new LinkedList<>();
                each.add(strs[i]);
                map.put(newString, each);
            }
        }
        Iterator<List<String>> i = map.values().iterator();
        while (i.hasNext()) {
            List<String> item = i.next();
            Collections.sort(item, new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return s1.compareTo(s2);
                }
            });
            res.add(item);
        }
        return res;
    }
}
