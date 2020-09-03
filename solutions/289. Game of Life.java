class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] next = new int[m][n];
        int dir[][]= new int[][]{
           {-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}
        };
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int liveCells =0;
                for(int[]d : dir){
                    int x = d[0]+i;
                    int y = d[1]+j;
                    if(x>=0 && x<m && y>=0 && y<n && board[x][y]==1)
                     liveCells++;
                }
                    if(board[i][j]==0 &&liveCells==3)
                        next[i][j]=1;
                    else if(board[i][j]==1){
                        if(liveCells==2 || liveCells ==3)
                            next[i][j]=1;   
                    }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                board[i][j]=next[i][j];
            }
        }
    }
}
