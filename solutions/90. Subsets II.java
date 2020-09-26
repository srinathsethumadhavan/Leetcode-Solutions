class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,subset,result,0);
        return result;
    }
    
    public void helper(int[] nums,List<Integer> subset ,List<List<Integer>> result,int x){
        result.add(new ArrayList<>(subset));
        
        for(int i=x;i<nums.length;i++){
            subset.add(nums[i]);
            helper(nums,subset,result,i+1);
            subset.remove(subset.size()-1);
            while(i+1<nums.length && nums[i]==nums[i+1])
                i++;
        }
    }
}
