class Solution {
    public int maxSubarraySumCircular(int[] A) {
        
       int linearSubArraySum = kadane(A);
        if(linearSubArraySum <0)
            return linearSubArraySum;
        int sum =0;
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
            A[i]=-A[i];
        }

        
            

        
       int circularSubArraySum = kadane(A) + sum;
        
       return  Math.max(linearSubArraySum,circularSubArraySum);
        
    }
    
    public int kadane(int[] A)
    {
        int result = A[0];
        int maxEnding = A[0];
        for(int i=1;i<A.length;i++)
        {
            maxEnding = Math.max(maxEnding+A[i],A[i]);
            result = Math.max(result,maxEnding);
        }
        return result;
    }
}