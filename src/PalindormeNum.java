/**
 * Created by guangshuozang on 8/28/15.
 */
public class PalindormeNum {

        public boolean isPalindrome(int x) {
            if(x<0)
                return false;
            int end = 0;
            int compare = x;
            while(compare!=0){
                end = end*10 + compare%10;
                compare=compare/10;
            }
            return x == end;
        }

}
