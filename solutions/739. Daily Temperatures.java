class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] arr = new int[T.length];
        int k=0;
        for(int i=0;i<T.length;i++){
           int count =1;
            for(int j=i+1;j<T.length;j++){
               if(T[j]>T[i] )
               {
                   
                   arr[k++]=count;
                   break;
                   
               }
                else if(j==T.length-1)
                   {
                       k++;
                       break;
                   }
                count++;
            }
        }
        return arr;
    }
}