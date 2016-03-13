package New_Easy.String;

/**
 * Created by guangshuozang on 3/12/16.
 */
public class Q58 {
    public int lengthOfLastWord(String s) {
        int index = s.lastIndexOf(" ");
        if(index == -1) return 0;
        else return s.length()-1-index;
    }
    //loop, when string is different from next/no next, reconstructure


    public static void main(String[] args) {
        Q58 ins = new Q58();
        System.out.println(ins.lengthOfLastWord("hello world s"));
    }
}
