package String;

/**
 * Created by guangshuozang on 10/9/15.
 */
public class ReverseWordInString_151 {
    public String reverseWords(String s) {
        String[] tmp = s.split("\\s");
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= tmp.length; i++){
            if(tmp[tmp.length - i].equals("")){
                continue;
            }

            sb.append(tmp[tmp.length - i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
