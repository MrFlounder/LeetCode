package Easy;

/**
 * Created by guangshuozang on 9/26/15.
 */
public class AddBinary_67 {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        if(len1==0 || len2==0)
            return len1==0? b: a;
        int index1 = len1-1;
        int index2 = len2-1;
        int promote = 0;
        StringBuffer str = new StringBuffer();
        while(index1>=0 || index2>=0 || promote==1) {
            int num1 = index1>= 0?  a.charAt(index1)-'0'  :  0;
            int num2 = index2>= 0?  b.charAt(index2)-'0'  :  0;
            int pos = (num1+num2+promote)%2;
            promote = (num1+num2+promote)/2;
            str.insert(0,pos);
            index1--;
            index2--;
        }
        return new String(str);
    }
}
