class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
    List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String,List<String>> map= new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String st = new String(ch);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<String>());
            }
            map.get(st).add(s);
        }
        
        groupedAnagrams.addAll(map.values());
        return groupedAnagrams;
    }
}