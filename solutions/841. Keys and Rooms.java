class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        Set<Integer> set = new HashSet<>();
        set.add(0);
        while(q.isEmpty()!=true){
            List<Integer> keys = rooms.get(q.poll());
         
                for(int key : keys)
                {
                    if(!set.contains(key))
                        q.add(key);
                    set.add(key);
                }
                
            
            
            
            }
        
        
        if(set.size()==rooms.size())
            return true;
        return false;
    }
}
