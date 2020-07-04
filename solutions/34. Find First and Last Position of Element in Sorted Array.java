class Solution {
    public int[] searchRange(int[] nums, int target) {
                
        int low =0;
        int high = nums.length-1;
        int []arr = new int[2];
        arr[0]=-1;arr[1]=-1;    
        arr[0] =  binarySearchFirst(nums,low,high,target);
        arr[1] = binarySearchLast(nums,low,high,target);
        return arr;
     }
    
    public int binarySearchFirst(int[] nums,int low,int high, int x){
        int mid;
        while(low<=high){
            mid = low+(high-low)/2;
            if((nums[mid]==x)&&(mid==0||nums[mid-1]!=x))
                return mid;
            else if(nums[mid]>=x)
                high = mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    
     public int binarySearchLast(int[] nums,int low,int high, int x){
        int mid;
        while(low<=high){
            mid = low+(high-low)/2;
            if((nums[mid]==x)&&(mid==nums.length-1||nums[mid+1]!=x))
                return mid;
            else if(nums[mid]>x)
                high = mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    
}