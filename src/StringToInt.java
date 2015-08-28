/**
 * Created by guangshuozang on 8/27/15.
 */
public class StringToInt {

        public int myAtoi(String str) {
            long result = 0;
            int i = 0;
            int flag = 1;
            while(i<str.length()){
                if(str.charAt(i)==' ')
                    i++;
                else
                    break;
            }
            if(i<str.length()){
                if(str.charAt(i)=='-'){
                    flag = -1;
                    i++;
                }
                else if(str.charAt(i)=='+'){
                    flag = 1;
                    i++;
                }
            }
            while(i<str.length()){
                if(str.charAt(i)-'0'>=0&&str.charAt(i)-'0'<=9){
                    result = result*10 + (str.charAt(i)-'0');
                    if(result > Integer.MAX_VALUE||result < Integer.MIN_VALUE)
                        if(flag==-1)
                            return Integer.MIN_VALUE;
                        else
                            return Integer.MAX_VALUE;
                    i++;
                }
                else
                    break;
            }

            return (int)(result)*flag;
        }


    public static void main(String arg[]){
        String s = "18446744073709551617";
        StringToInt instance = new StringToInt();
        System.out.println(instance.myAtoi(s));
    }
}
