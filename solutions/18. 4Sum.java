class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      
        
        List<List<Integer>> res = new ArrayList<>();
         if(nums.length<4 || nums==null)
            return res;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
        {
            int left = j+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[j]+nums[left]+nums[right];
                if(sum==target)
                {
                     List<Integer> l= new ArrayList<>();
                    l.add(nums[i]);
                     l.add(nums[j]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    res.add(l);
                    int leftVal= nums[left];
                    while(left<nums.length && leftVal==nums[left])
                        left++;
                     int rightVal= nums[right];
                    while(right>left && rightVal==nums[right])
                        right--;
                }
                else if(sum<target)
                    left++;
                else
                    right--;
                
            }
            while(j+1<nums.length && nums[j]==nums[j+1])
                j++;
            while(i+1<nums.length && nums[i]==nums[i+1])
                i++;
            
        }
        }
        return res;
    }
}