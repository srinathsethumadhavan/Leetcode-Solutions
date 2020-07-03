class Solution {
    public int findKthLargest(int[] nums, int k) {
      Queue<Integer> q = new PriorityQueue<>();
        for(int n : nums){
           q.add(n);
            if(q.size()>k)
                q.poll();
        }
        return q.peek();
        }
}

//minimum priority queue always removes the minimum elelemnt 