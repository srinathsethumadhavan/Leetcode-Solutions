class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int n : nums)
           q.add(n);
            int i=0;
            int result =0;
            while(i<k && q.isEmpty()!=true){
                result=q.remove();
                if(i==k)
                    break;
                i++;
            }
            return result;
        }
}
​
//minimum priority queue always removes the minimum elelemnt 
