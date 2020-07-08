class Solution {
    public boolean canReorderDoubled(int[] A) {
        
       Map<Integer,Integer> map = new HashMap<>();
        Integer[] B = new Integer[A.length];
        for(int i: A)
      map.put(i,map.getOrDefault(i,0)+1);
        for (int i = 0; i < A.length; ++i)

        B[i]=A[i];
        Arrays.sort(B,Comparator.comparingInt(Math::abs));
        for(int i:B){
            if(map.get(i)==0)
                continue;
            if(map.getOrDefault(2*i,0)<=0)
                return false;
            map.put(i,map.get(i)-1);
            map.put(2*i,map.get(2*i)-1);
        }
        
        return true;
    }
}