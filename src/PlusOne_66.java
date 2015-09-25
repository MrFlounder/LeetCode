/**
 * Created by guangshuozang on 9/25/15.
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0)
            return new int[] {1};
        digits[digits.length-1] = digits[digits.length-1] + 1;
        int i = digits.length-1;
        while(i>0){
            if(digits[i]==10){
                digits[i]=0;
                digits[i-1] = digits[i-1]+1;
            }
            i--;
        }
        if(digits[i]==10){
            digits[i]=0;
            int[] result = new int[digits.length+1];
            result[0]=1;
            for(int k=1;k<result.length;k++){
                result[k]=digits[k-1];
            }
            return result;

        }else
            return digits;
    }
}
