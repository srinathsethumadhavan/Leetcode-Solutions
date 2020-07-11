class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums)
            map.put(i,map.getOrDefault(i,0)+1);
       
        int res = 0;
        for(Map.Entry m:map.entrySet())
            if(map.containsKey((int)m.getKey()+1))
               res= Math.max(res,map.get(m.getKey())+map.get((int)m.getKey()+1));
        return res;
       
    }
}



/*
 make use of a hashmap mapmap which stores the number of times an element occurs in the array along with the element's value  

 we traverse over the keys of the mapmap  For every key of the mapmap considered,  find out if the map contains the key + 1. 
 whenver we find that key + 1 exists in the keys of mapmap, we determine the count of the current harmonic subsequence as count_{key} + count_{key+1}count 

  
*/