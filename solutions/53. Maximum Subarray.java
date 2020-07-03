class Solution {
    public int maxSubArray(int[] A) {
        int current_max=A[0];
        int result = A[0];
        for(int i=1;i<A.length;i++){
            current_max= Math.max(A[i]+current_max,A[i]);
            result= Math.max(current_max,result);
        }
            return result;
    }
}