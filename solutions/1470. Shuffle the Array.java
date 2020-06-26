class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] temp = new int[nums.length];
        int j = nums.length/2;
        int k =0;
        for(int i =0;i<nums.length/2;i++,j++){
            temp[k++]=nums[i];
            temp[k++]=nums[j];
        }
        return temp;
    }
}