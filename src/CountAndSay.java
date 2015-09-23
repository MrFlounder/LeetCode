import java.util.HashSet;

/**
 * Created by guangshuozang on 9/22/15.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";
        String result = f("11");
        for(int i=3;i<n;i++){
            result = f(result);
        }
        return result;
    }
    public String f(String n) {
        char[] chset = n.toCharArray();
        StringBuilder s = new StringBuilder();
        int i = 1;
        int count = 1;
        while(i<chset.length){

            if(chset[i-1]==chset[i]) {
                count++;
            }
            else{
                s.append(Integer.toString(count));
                s.append(chset[i-1]);
                count = 1;
            }
            if (i == chset.length - 1) {
                s.append(Integer.toString(count));
                s.append(chset[i]);
            }
            i++;
        }
        return s.toString();
    }
    public static void main(String arg[]){
        CountAndSay ins = new CountAndSay();
        System.out.println(ins.countAndSay(4));
    }
}
