package DP;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by guangshuozang on 10/7/15.
 */
public class WordBreak_139 {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] f = new boolean[s.length() + 1];
        Arrays.fill(f, false);

        f[0] = true;

        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(f[j]&&wordDict.contains(s.substring(j,i)))
                    f[i]=true;
            }
        }
        return f[s.length()];
    }
}
