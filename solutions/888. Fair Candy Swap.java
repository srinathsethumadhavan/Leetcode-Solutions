class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sa = 0;
        int sb =0;
        for(int x:A)
            sa+=x;
        for(int x:B)
            sb+=x;
        int delta = (sb-sa)/2;
        Set<Integer> set = new HashSet<>();
        for(int x: B){
            set.add(x);
        }
        for(int x: A){
            if(set.contains(x+delta))
                return new int[]{x,x+delta};
        }
        
       //  List<Integer> list1 = new ArrayList<>();
       // List<Integer> list2 = new ArrayList<>();
       //  for(int x: A)
       //  list1.add(x);
       //  for(int x: B)
       //  list2.add(x);
       //      for(int x: list1){
       //          if(list2.contains(delta+x))
       //               return new int[]{x,x+delta};
       //      }                            
         return null;
    }
}