class Solution {
    public double findMaxAverage(int[] A, int k) {
       
        int currSum =0;
    for(int i=0;i<k;i++)
        currSum+=A[i];
        int maxSum = currSum;
        for(int i=k;i<A.length;i++)
        {    currSum+=(A[i]-A[i-k]);
             maxSum= Math.max(currSum,maxSum);
        }
        
        return (double)maxSum/(double)k;
    }
}