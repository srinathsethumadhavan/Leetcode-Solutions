class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,0,word))
                    return true;
            } 
        }
         return false;
        
    }
    public boolean dfs(char [][] board,int i,int j,int count,String word) {
        
        if(count==word.length())
            return true;
        
        if(i<0 || i>=board.length || j<0 || j>=board[i].length ||
           board[i][j]!=word.charAt(count))
            return false;
        
        char temp= board[i][j];
        board[i][j]='#';
        
        boolean found = dfs(board,i+1,j,count+1,word)||dfs(board,i-1,j,count+1,word)||
            dfs(board,i,j+1,count+1,word)||dfs(board,i,j-1,count+1,word);
        
    board[i][j]=temp;
        return found;
            
    }
}
​
/*
first find the stating posiiton  of the first letter of the word  in the board.
now four possible directions we need to search.
check for boundaries .we cannot got beyond the lenght of the board
if count becomes equal to the word length then we found the word simply return
mark the visited cell with some indication so tht the same cell is not taken ointo considreation during the next recurisve call
aftr the recursove call 
replace the cell with original character to make the next call 
​
*/
​
