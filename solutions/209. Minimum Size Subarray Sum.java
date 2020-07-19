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


/*

ALGORITHM

Initialize left pointer to 0 and sum to 0
Iterate over the nums:
Add nums[i] to sum
While sum is greater than or equal to s:
Update result= Math.min(result,j-i+1) is the size of current subarray
It means that the first index can safely be incremented, since, the minimum subarray starting with this index  has been achieved
Subtract nums[left] from sum and increment left
*/