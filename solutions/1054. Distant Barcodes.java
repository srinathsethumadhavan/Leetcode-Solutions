class Solution {
    
    public int[] rearrangeBarcodes(int[] barcodes) {
       int k=0;
       HashMap<Integer,Integer> map = new HashMap<>();
       PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        
        int[] arr = new int[barcodes.length];
        
        for(int i : barcodes)
            map.put(i,map.getOrDefault(i,0)+1);
        queue.addAll(map.keySet());
        while(queue.size()>1){
            Integer a =queue.remove();
            Integer b = queue.remove();
            arr[k++]=a;
            arr[k++]=b;
            map.put(a,map.get(a)-1);
            map.put(b,map.get(b)-1);
            if(map.get(a)>0)
                queue.add(a);
            if(map.get(b)>0)
                queue.add(b);
        }
        if(queue.isEmpty()!=true){
           
            Integer a = queue.remove();
             if(map.get(a)==1)
            arr[k++]=a;
          
                
        }
        return arr;
            
    }
    
}
