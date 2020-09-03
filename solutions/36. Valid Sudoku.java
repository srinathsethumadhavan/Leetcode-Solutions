class Solution {
    public boolean isValidSudoku(char[][] board) {
        char value;
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<board[0].length;i++){
          for(int j=0;j<board.length;j++){
               value= board[i][j];
              if(value!='.'){
                  if(!set.add(value+"in the row"+i)||
                    (!set.add((value+"in the column"+j)))||
                    (!set.add(value+"in the grid"+i/3+"-"+j/3)))
                      return false;
              }
          }
        }
        return true;
    }
}
