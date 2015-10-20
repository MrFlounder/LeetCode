package String;

/**
 * Created by guangshuozang on 10/19/15.
 */
public class ReverseWordsInAString_186 {
    public void reverseWords(char[] s) {
        if(s.length==1) return;
//         s^ = eht yks si eulb
// ⇒ blue is sky the
        int start = 0;
        for(int i=0;i<=s.length;i++){
            if(i==s.length){
                for(int k=start;k<i&&k<i-k-1+start;k++){
                    char temp;
                    temp = s[k];
                    s[k]=s[i-k-1+start];
                    s[i-k-1+start] = temp;
                }
                start = i+1;
            }
            else if(s[i]==' '){
                for(int k=start;k<i&&k<i-k-1+start;k++){
                    char temp;
                    temp = s[k];
                    s[k]=s[i-k-1+start];
                    s[i-k-1+start] = temp;
                }
                start = i+1;
            }
        }
        for(int k=0;k<s.length&&k<s.length-k;k++){
            char temp;
            temp = s[k];
            s[k]=s[s.length-1-k];
            s[s.length-k-1] = temp;
        }
    }
    public static void main(String arg[]){
        ReverseWordsInAString_186 ins = new ReverseWordsInAString_186();
        String s = "Hello World!";
        ins.reverseWords(s.toCharArray());
    }
}
