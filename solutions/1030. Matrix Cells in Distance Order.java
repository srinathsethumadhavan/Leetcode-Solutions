class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
     
        int[][] arr = new int[R*C][2];
        int k=0;
        for(int i=0;i<R;i++)
            for(int j=0;j<C;j++)
                arr[k++]=new int[]{i,j};
            
        
         Arrays.sort(arr,(int[] a ,int[] b)->{
             
            int distance1 = Math.abs(r0-a[0])+Math.abs(c0-a[1]);
            int distance2 = Math.abs(r0-b[0])+Math.abs(c0-b[1]);
            return distance1-distance2;
         });
        
      
        
        return arr;
    }
    
    }
​
