class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
       
        for(int i=0;i<nums.length;i++)
        {
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0)
                {
                     List<Integer> l= new ArrayList<>();
                    l.add(nums[i]);
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
                else if(sum<0)
                    left++;
                else
                    right--;
                
            }
            
            while(i+1<nums.length && nums[i]==nums[i+1])
                i++;
            
        }
        return res;
    }
}