package BackTracking;

/**
 * Created by guangshuozang on 10/1/15.
 */
public class WordSearch_79 {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(helper(board, i, j, 0, word, visited )) return true;
            }
        }
        return false;
    }
    public boolean helper(char[][] board, int x, int y, int p, String word, boolean[][] visited){
        if(x<0||x>board.length-1||y<0||y>board[0].length-1||p>word.length()-1) return false;
        if(word.charAt(p)!=board[x][y]) return false;
        if(!visited[x][y])
            visited[x][y] = true;
        else
            return false;
        if(word.charAt(p)==board[x][y]&&p==word.length()-1)
            return true;

        boolean flag = helper(board,x,y+1,p+1,word,visited)
                ||helper(board,x,y-1,p+1,word,visited)
                ||helper(board,x+1,y,p+1,word,visited)
                ||helper(board,x-1,y,p+1,word,visited);
        visited[x][y] = false;

        String s;


        return flag;
    }
    public static void main(String arg[]){
        WordSearch_79 ins = new WordSearch_79();
        ins.exist(new char[][]{{'a'}}, "ab" );
    }
}
