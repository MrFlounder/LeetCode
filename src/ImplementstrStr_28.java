/**
 * Created by guangshuozang on 9/2/15.
 */
public class ImplementstrStr_28 {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(haystack.equals(needle))
            return 0;
        int l = haystack.length()-needle.length();
        for(int i=0;i<l+1;++i){
            String temp = haystack.substring(i,i+needle.length()-1);
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
    public static void main(String arg[]){
        String s = "mississippi";
        ImplementstrStr_28 instance = new ImplementstrStr_28();
        System.out.println(instance.strStr(s,"pi"));
    }
}
