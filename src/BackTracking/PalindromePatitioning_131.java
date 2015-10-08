package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 10/7/15.
 */
public class PalindromePatitioning_131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        partition(ans, new ArrayList<String>(), s, 0);
        return ans;
    }

    private void partition(List<List<String>> ans, ArrayList<String> part,
                           String s, int start) {
        if (start == s.length()) {
            List<String> li = new ArrayList<>(part);
            ans.add(li);
        }
        for (int i = start; i < s.length(); i++) {
            if (isParlindrome(s.substring(start, i+1))){
                part.add(s.substring(start, i+1));
                partition(ans, part, s, i+1);
                part.remove(part.size() - 1);
            }
        }
    }

    private boolean isParlindrome(String s) {
        int l = 0, r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++; r--;
        }
        return true;
    }
}
