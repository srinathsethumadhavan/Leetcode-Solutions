class Solution {
    public int minDeletionSize(String[] A) {
        int ans = 0;
        for(int col = 0;col<A[0].length();col++){
            for(int row=0;row<A.length;row++){
                if(row+1<A.length && A[row].charAt(col)>A[row+1].charAt(col)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}


/*
                     col
                      |....
                      
                      0 1 2 
row-------->          c b a
                      d a f
                      g h i 
*/