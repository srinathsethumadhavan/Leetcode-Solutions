class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        
         List<Integer> list = new ArrayList<>();
        if(m.length==0)
            return list;
       int left= 0;
        int right=m[0].length-1;
        int top=0;
        int bottom=m.length-1;
       
        while(top<=bottom && left<=right)
        {
            
                for(int i=left;i<=right;i++)
                   list.add(m[top][i]);
                top++;
                   
            
                for(int i=top;i<=bottom;i++)
                   list.add(m[i][right]);
               right--;
            
          if(top<=bottom){
              for(int i=right;i>=left;i--)
                   list.add(m[bottom][i]);
                bottom--;
              
          }
                  
            if(left<=right){
            
                  for(int i=bottom;i>=top;i--)
                   list.add(m[i][left]);
                left++;
            }
            
        }
        
        return list;
    }
}