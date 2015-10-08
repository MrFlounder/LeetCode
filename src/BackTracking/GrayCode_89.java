package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guangshuozang on 10/7/15.
 */
public class GrayCode_89 {
    public static List<Integer> grayCode(int n) {
        List<Integer> code = new ArrayList<Integer>();
        code.add(0);
        genCodes(code,n,0,1<<n);
        return code;
    }
    public static void genCodes(List<Integer> code, int n, int curr, int size) {
        if(code.size()==size) return;
        for(int i=0;i<n;i++) {
            int mask = 1<<i;
            int el = (curr^mask);
            if(!code.contains(el)) {
                code.add(el);
                genCodes(code,n,el,size);
            }
        }
    }
}
