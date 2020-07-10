class Solution {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        
        int[][] matrix = new int[R*C][2];
        int [] directions = {0,1,0,-1,0};
        int d = 0;
        int i=0;
        int len=0;
        matrix[i++]=new int[]{r0,c0};
        
        while(i<R*C){
            if(d==0||d==2){
                len++;
            }
            for(int k=0;k<len;k++){
                r0+=directions[d];
                c0+=directions[d+1];
                if(r0>=0 && r0<R && c0>=0 && c0<C)
                    matrix[i++]=new int[]{r0,c0};             
            }
            d = ++d%4;                  
        }
        
        return matrix;
        
        
    }
}




/*


Solution explained:

d=0; east
d=1; south
d=2; east
d=3; north

           (-1,0)
   (0,-1)  (0,0)  (0,1)
           (1,0)
           
           
   which gives the direction array ={ 0,1,0,-1,0}        
   we increment the length if d==0 or d==2 because we should not traverse the same element 
    we should also ensure that whenever we go out of boundary we dont update the entry in matrix 
    r0,c0 is >=0
    r0 <R
    c0<C
    becuase we follow zero based indexing 
    
   
1. we could use an array of directions to control the moving in four directions, this is a common technique that we could apply in a lot of 2-d matrix problem;
2. every time when moving towards the east or west, we'll increase the length by one;
3. we break out of the while loop when we have filled out all the rows.




*/