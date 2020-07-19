class Solution {
    public int minSubArrayLen(int s, int[] nums) {
       int result =Integer.MAX_VALUE;
        int i = 0;
        int sum =0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=s){
                result= Math.min(result,j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        
        return result==Integer.MAX_VALUE?0:result;
    }
}