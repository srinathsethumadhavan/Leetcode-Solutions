class Solution {
    Map<String,Integer> map = new HashMap<>();
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        
        for(String s: words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> maxHeap = new PriorityQueue<>(new myComparator());   
        maxHeap.addAll(map.keySet());
        int i=0;
        while(i<k && maxHeap.isEmpty()!=true){
            list.add(maxHeap.remove());
            i++;
        }
       return list; 
    }
    
    class myComparator implements Comparator<String>{
        public int compare(String a,String b){
            int freqCompare = map.get(b)-map.get(a);
            int alphabeticalCompare = a.compareTo(b);
            if (freqCompare == 0) { 
                return ((alphabeticalCompare == 0) ? freqCompare : alphabeticalCompare); 
            } else { 
                return freqCompare; 
            } 
        }
    }
}
