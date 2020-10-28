class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || nums1==null || nums2==null)
            return result;
        
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        PriorityQueue<List<Integer>> pq3 = new PriorityQueue<>
            ((a,b)-> (a.get(0)+a.get(1))-(b.get(0)+b.get(1)));
        
        for(int i=0;i<nums1.length;i++){
             for(int m : nums2)
            pq2.add(m);
         while(pq2.isEmpty()!=true){
            List<Integer> list = new ArrayList<>(); 
             list.add(nums1[i]);
             list.add(pq2.poll());
            pq3.add(list);
            
         }
        }
        
         for(int i=0;i<k && pq3.isEmpty()!=true ;i++)                                         
            result.add(pq3.poll())  ;                                                               return result;                                    
    }
}
