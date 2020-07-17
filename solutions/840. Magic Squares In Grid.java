class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        
          int row = grid.length;
        int col = grid[0].length;
        int squares = 0;
        
        for(int r = 0; r < row-2; r++){
            for(int c = 0; c < col-2; c++){
                if(grid[r+1][c+1] != 5) 
                    continue;
                   if(isMagic(grid[r][c], grid[r][c+1], grid[r][c+2], 
                         grid[r+1][c], grid[r+1][c+1], grid[r+1][c+2], 
                         grid[r+2][c], grid[r+2][c+1], grid[r+2][c+2])) 
                    squares++;
            }
        }
        return squares;
    }
    
    public boolean isMagic(int... vals){
        // use the Set to check for distinct numbers
        Set<Integer> valSet = new HashSet<>();
        for(int v : vals){
            // numbers cannot be greater than 9 or less than 1
            if(valSet.contains(v) || v > 9 || v < 1) 
                return false;
            valSet.add(v);
        }
        
        // sum them up, across, and diagonally
        return (vals[0] + vals[1] + vals[2] == 15 &&
                vals[3] + vals[4] + vals[5] == 15 &&
                vals[6] + vals[7] + vals[8] == 15 &&
                vals[0] + vals[3] + vals[6] == 15 &&
                vals[1] + vals[4] + vals[7] == 15 &&
                vals[2] + vals[5] + vals[8] == 15 &&
                vals[0] + vals[4] + vals[8] == 15 &&
                vals[2] + vals[4] + vals[6] == 15);
    }
}