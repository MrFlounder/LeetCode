/**
 * Created by guangshuozang on 9/25/15.
 */
public class LengthOfLastWord_45 {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int count = 0;
        while(i>=0){
            if(i==s.length()-1){
                while(i>=1){
                    if(s.charAt(i)==' ')
                        i--;
                    else
                        break;
                }
            }
            if(s.charAt(i)!=' ')
                count++;
            else{

                break;
            }

            i--;
        }
        return count;
    }
}
