package String;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 10/17/15.
 */
public class FlipGame_293 {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<>();

        if (s == null || s.length() < 2) {
            return res;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.startsWith("++", i)) {
                res.add(s.substring(0, i) + "--" + s.substring(i + 2));
            }
        }

        return res;
    }
}
