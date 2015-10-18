package BackTracking;

/**
 * Created by guangshuozang on 10/17/15.
 */
public class FlipGame2_294 {
    public boolean canWin(String s) {
        if(s.length()==0||s.length()==1) return false;
        return DFS(s, true);
    }
    public boolean DFS(String s, boolean isMyturn){
        boolean r = true;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)&&s.charAt(i)=='+'){
                r=false;
                break;
            }
        }
        if(r&&!isMyturn) return true;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)||s.charAt(i)=='-') continue;
            String t = s.substring(0, i) + "--" + s.substring(i + 2);
            if(DFS(t,!isMyturn)) return true;
        }
        return false;
    }
    public static void main(String arg[]){
        FlipGame2_294 ins = new FlipGame2_294();
        ins.canWin("+++++++++");
    }
}
