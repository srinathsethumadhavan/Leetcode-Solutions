class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length/2];
        int sum1=0;
         int sum2=0;
        for(int i=0;i<nums.length;i++)
            sum1+=Math.abs(m-nums[i]);
        if(nums.length%2==1)
            return sum1;
        else{
            int n = nums[nums.length/2-1];
            for(int i=0;i<nums.length;i++)
                sum2+=Math.abs(n-nums[i]);
            
        }
        
      return   Math.min(sum1,sum2);
    }
}