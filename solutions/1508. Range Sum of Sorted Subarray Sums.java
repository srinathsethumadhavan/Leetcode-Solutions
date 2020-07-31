class Solution {
    public int rangeSum(int[] A, int n, int left, int right) {
        int [] arr  =new int[n*(n+1)/2];
        int sum =0;
        int k=0;
        int mod=1000000007;
        for(int i=0;i<A.length;i++){
            sum=0;
            for(int j=i;j<A.length;j++)
            {
                sum+=A[j];
                 arr[k++]=sum;
            }
            
        }
        
      sum=0;
        Arrays.sort(arr);
       
        for(int i=left-1;i<right;i++)
            sum=(sum+arr[i])%mod;;
        return sum;
    }
}
