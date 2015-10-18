package BackTracking;

/**
 * Created by guangshuozang on 10/17/15.
 */
public class FlipGame2_294 {
    public boolean canWin(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.startsWith("++", i)) {
                String t = s.substring(0, i) + "--" + s.substring(i + 2);

                if (!canWin(t)) {
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String arg[]){
        FlipGame2_294 ins = new FlipGame2_294();
        ins.canWin("+++++++++");
    }
}
