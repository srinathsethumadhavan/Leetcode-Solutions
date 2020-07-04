class Solution {
    public int smallestRangeI(int[] A, int k) {
       int max=A[0];
        int min = A[0];
        for(int i=0;i<A.length;i++){
            if(max<A[i])
                max=A[i];
            if(min>A[i])
                min=A[i];
        }
        int a= min+k;
        int b =max-k;
        if((b-a)<0)
            return 0;
        return b-a;
    }
}