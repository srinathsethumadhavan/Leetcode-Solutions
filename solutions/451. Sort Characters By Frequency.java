class Solution {
    public String frequencySort(String s) {
       
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        PriorityQueue<Character> pqueue = new PriorityQueue<>((a,b)->  map.get(b)-map.get(a));
        pqueue.addAll(map.keySet());
        StringBuilder str= new StringBuilder();
        while(pqueue.isEmpty()!=true){
            char current = pqueue.remove();
           for(int i=0;i<(Integer)map.get(current);i++)
               str.append(current);
        }
        return str.toString();
    }
}
