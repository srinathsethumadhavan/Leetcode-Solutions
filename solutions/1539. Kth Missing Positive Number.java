class Solution {
    public int findKthPositive(int[] arr, int k) {
   
        int j=0;
        int i=1;
        while(k!=0)
        {
            if(j<arr.length && arr[j]==i)
                j++;
            else                
                k--;
            i++;     
        }
        
        return i-1;
    }
}
        
 
​
​
