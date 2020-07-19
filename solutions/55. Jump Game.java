class Solution {
    public boolean canJump(int[] nums) {
        int reachable =0;
        for(int i=0;i<nums.length;i++){
            if(reachable<i)
                return false;
            reachable =Math.max(reachable,i+nums[i]);
        }
        return true;
    }
}

/*

we keep track of the maximum reachable distance using i+nums[i];
we traversee the entire array
at any point if we encounter a point here maximum reachble distance beocms less than the index we are currently at duirng traversal, it means we cannot reach the end of array 

*/