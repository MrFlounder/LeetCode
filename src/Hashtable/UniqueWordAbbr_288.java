package Hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guangshuozang on 10/21/15.
 */
public class UniqueWordAbbr_288 {
    Map<String, String> map = new HashMap<>();

    public ValidWordAbbr(String[] dictionary) {
        for (String dic : dictionary) {
            String key = getKey(dic);
            if (map.containsKey(key)) {
                map.put(key, "");
            } else {
                map.put(key, dic);
            }
        }
    }

    public boolean isUnique(String word) {
        String key = getKey(word);
        return !map.containsKey(key) || map.get(key).equals(word);
    }

    private String getKey(String word) {
        String key = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
        return key;
    }
}
