class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        Map<String,Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int i=0;
        while((i+10)<=s.length()){
            String str = s.substring(i, i+10); 
            map.put(str, map.getOrDefault(str,0)+1);
            if(map.get(str)==2)
                list.add(str);
            i++;
            
                
        }
       
       
        return list;
    }
}

 