import java.util.Collections; 
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
    
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
       
        int totalSum = 0;
        int currentSum =0;
        int remainingSum =0;
        for(int i : nums){
            totalSum+=i;
        }
        
    
        for(int i=nums.length-1;i>=0;i--)
        {
            list.add(nums[i]);
            currentSum+=nums[i];
            
            remainingSum = totalSum-currentSum;
           
            if(currentSum>remainingSum)
                break;
        }
        
        return list;
        
        
    }
}
