/**
 * Created by guangshuozang on 8/27/15.
 */
public class ZigZag {

        public String convert(String s, int numRows) {
            if(numRows == 1||s.length()<2)
                return s;
            StringBuilder result = new StringBuilder();
            int distance = 2*numRows-2;
            for(int r=0;r<numRows;r++){
                int gap = distance - 2*r;
                for(int i=0;(i*distance+r)<s.length();i++){
                    if(gap==0||gap==distance)
                        result.append(s.charAt(i*distance+r));
                    else{
                        result.append(s.charAt(i*distance+r));
                        if((i*distance+gap+r)<s.length())
                            result.append(s.charAt(i*distance+gap+r));
                    }
                }
            }
            return result.toString();
        }

}
