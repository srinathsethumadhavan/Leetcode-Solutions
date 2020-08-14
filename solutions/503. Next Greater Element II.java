class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stack = new Stack<>();
        int[] arr  =new int[nums.length];
        int n = nums.length;
        Arrays.fill(arr,-1);
                    
        for(int i=0;i<nums.length*2;i++)
        {
                while(stack.isEmpty()!=true && nums[stack.peek()]<nums[i%n])
                    arr[stack.pop()]=nums[i%n];
            
            if(i<n)
            stack.push(i);
            
        }
        return arr;
            
    }
}
