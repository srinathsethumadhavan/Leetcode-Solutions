class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[] answers = new int[n];
        
        answers[0]=1;
       
        
        for(int i=1;i<n;i++)
            answers[i]=answers[i-1]*nums[i-1];
        int r=1;
        for(int i=n-1;i>=0;i--)
        {
            answers[i]= answers[i]*r;
            r=r*nums[i];
        }
        
        return answers;
        
    }
}
