class Solution {
    HashMap<Character,Integer> map = new HashMap<>();
    public String reorganizeString(String S) {
        
        PriorityQueue<Character> queue = new PriorityQueue<>(new myComparator());
       StringBuilder sb = new StringBuilder();
        for(char c : S.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        queue.addAll(map.keySet());
        
        while(queue.size()>1){
            Character a = queue.remove();
            Character b = queue.remove();
            sb.append(a);
            sb.append(b);
            map.put(a,map.getOrDefault(a,0)-1);
            map.put(b,map.getOrDefault(b,0)-1);
            if(map.get(a)>0)
                queue.add(a);
             if(map.get(b)>0)
                queue.add(b);   
            
        }
        
        if(queue.isEmpty()!=true){
            Character c = queue.remove();
            if(map.get(c)>1)
                return "";
            else
                sb.append(c);
        }
        
        return sb.toString();
    }
    
   class myComparator implements Comparator<Character>{
        public int compare(Character a, Character b){
            return map.get(b)-map.get(a);
        }
    }
}
​
 
