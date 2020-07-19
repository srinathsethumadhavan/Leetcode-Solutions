class Solution {
    public void nextPermutation(int[] nums) {
      
        int k = nums.length-2;
      while(k>=0 && nums[k]>=nums[k+1])
          k--;
      
        if(k==-1)
            reverse(nums,0,nums.length-1);
        else{
            for(int l=nums.length-1;l>=0;l--)
                if(nums[l]>nums[k]){
                    int temp = nums[l];
                    nums[l]=nums[k];
                    nums[k]=temp;
                    break;
                }  
             reverse(nums,k+1,nums.length-1);
           }
        
        
    }
    
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
            
        }
    }
}

/*
start from last second index (k)
now we need to find the largest decreasing sufix.
compare the nums[k] and n[k+1]. loop until u find the element which meets the condition nums[k]<nums[k+1]
if k becomes -1 then the permutation is already the highest possible permutation. simple revese entire array and return.
if k>=0
this is the main point where we separate the given array as prefix and suffix.
0 to k-------------> prefix
a[k+1] to a[nums.length-1] -------------------->largest decreasing suffix
find the fisrt largest element than nums[k].
swap arr[k] and arr[l];
reverse the array from k+1 to last
*/