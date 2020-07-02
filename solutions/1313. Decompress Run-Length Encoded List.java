class Solution {
    public int[] decompressRLElist(int[] nums) {
        
       List<Integer> list = new ArrayList<Integer>();
        int i=0;
        while(i<nums.length){
            int a= nums[i++];
            int b= nums[i++];
            for(int n=0;n<a;n++)
             list.add(b);            
        }
        
            int [] arr = new int[list.size()];
            for(int m=0;m<list.size();m++)                       
                 arr[m]=list.get(m);
          return arr;
        }
}