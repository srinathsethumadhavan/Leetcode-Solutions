class Solution {
    public void sortColors(int[] nums) {
        int zero =0;
        int one =0;
        int two =0;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==0)
                zero++;
            if(nums[i]==1)
                one++;
            if(nums[i]==2)
                two++;
        }       
        for( int j=0;j<zero;j++)
            nums[j]=0;
        for(int j=0 ;j<one;j++)
            nums[j+zero]=1;
        for(int j=0;j<two;j++)
            nums[j+zero+one]=2;
    }
}
