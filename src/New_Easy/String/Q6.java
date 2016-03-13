package New_Easy.String;

/**
 * Created by guangshuozang on 3/13/16.
 */
public class Q6 {
    public String convert(String s, int numRows) {
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
        int i = 0;
        while(i<s.length()){
            for(int j=0;j<numRows&&i<s.length();j++){
                sb[j].append(s.charAt(i));
                i++;
            }
            for(int j=numRows-2;j>0&&i<s.length();j--){
                sb[j].append(s.charAt(i));
                i++;
            }
        }
        i = 1;
        while(i<numRows){
            sb[0].append(sb[i]);
            i++;
        }
        return sb[0].toString();
    }



    public static void main(String[] args) {
        Q6 ins = new Q6();
        System.out.println(ins.convert("PAYPALISHIRING",3));
    }
}
