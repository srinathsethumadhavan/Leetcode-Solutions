class Solution {
    public boolean checkSubarraySum(int[] A, int k) {
        
        int sum =0;
        
        for(int i=0;i<A.length;i++){
            sum = A[i];
            for(int j=i+1;j<A.length;j++)
            {
                sum+=A[j];
                if(k==0 && sum==k)
                    return true;
                    
                else if(k!=0 &&sum%k==0)
                    return true;
            }
            
        }
        
        return false;
    }
}
