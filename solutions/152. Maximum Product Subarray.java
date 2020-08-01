class Solution {
    public int maxProduct(int[] nums) {
       int prevMax = nums[0];
        int currMax= nums[0];
        int prevMin = nums[0];
        int currMin = nums[0];
        int answer= nums[0];
        for(int i=1;i<nums.length;i++){
            currMax = Math.max(Math.max(prevMax*nums[i],prevMin*nums[i]),nums[i]);
            currMin = Math.min(Math.min(prevMin*nums[i],prevMax*nums[i]),nums[i]);
            answer = Math.max(answer,currMax);
            prevMax= currMax;
            prevMin= currMin;
        }
        return answer;
    }
}
