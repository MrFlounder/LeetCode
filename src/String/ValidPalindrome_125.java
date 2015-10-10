package String;

/**
 * Created by guangshuozang on 10/9/15.
 */
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); // convert all to lower cases.
        s = s.replaceAll("[^a-z^0-9]+", ""); // remove all non-digital and non-letter.
        int len = s.length();
        for (int i = 0; i < len; i++){
            if (s.charAt(i) != s.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }
}
