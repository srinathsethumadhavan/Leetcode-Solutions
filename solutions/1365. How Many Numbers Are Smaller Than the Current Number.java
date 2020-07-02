class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int m=0;
        int [] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if((nums[i]>nums[j])&(i!=j))
                    count++;
                    
            }
            arr[m++]=count;
        }
        
        return arr;
        
    }
}