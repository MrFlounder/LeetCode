package New_Easy.String;

/**
 * Created by guangshuozang on 3/13/16.
 */
public class Q28 {
    public int strStr(String haystack, String needle) {
        int h = haystack.length(), n = needle.length();
        if(n>h) return -1;
        for(int i=0;i<=h-n;i++){
            if(haystack.substring(i,i+n).equals(needle))
                return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Q28 ins = new Q28();
        System.out.println(ins.strStr("adsfhello","hello"));
    }
}
