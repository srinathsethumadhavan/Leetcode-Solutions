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