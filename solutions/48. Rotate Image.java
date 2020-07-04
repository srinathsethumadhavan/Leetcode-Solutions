class Solution 
{
    public void rotate(int[][] A)
        {

            int n = A.length;
            for (int i = 0; i < n; i++) 
                for (int j = i+1; j < n; j++) 
                { 
                     int temp = A[i][j]; 
                     A[i][j] = A[j][i]; 
                     A[j][i] = temp; 
                }         
            reverseColumns(A);
       
        }
   
    public void reverseColumns(int[][] arr)
    {
          int n = arr.length;
        
    for (int i = 0;i<n;i++) { 
   
        
        int start = 0; 
        int end = n-1; 
   
       
        while (start < end) { 
   
           
            int temp = arr[i][start]; 
            arr[i][start] = arr[i][end]; 
            arr[i][end] = temp; 
               start++; 
            end--; 
        } 
        
    }
}
}