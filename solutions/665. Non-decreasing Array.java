class Solution {
    public boolean checkPossibility(int[] nums) {
        
                int count = 0;
        for(int i = 1; i < nums.length && count <= 1; i++)
        {
            
            if(nums[i-1] > nums[i])
            {
                
                count++;
                if( (i ==1) || nums[i-2] <= nums[i] )
                {
                    nums[i-1] = nums[i];
                }
                else
                {
                    nums[i] = nums[i-1];
                }
                
            }
            
        }

        
        
        
        return count<=1;
    }
}


//[4,6,3]
//[4,5,3]