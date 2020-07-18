class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        String[] s= paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9\\s+]", " ").split("\\s+");
        String res ="";
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++)         
          map.put(s[i],map.getOrDefault(s[i],0)+1);
               
        for(int i=0;i<banned.length;i++){
            if(map.containsKey(banned[i]))
               map.remove(banned[i]);
        }
               
        for(Map.Entry m : map.entrySet()){
            if(max<(Integer)m.getValue()){
                max= (Integer)m.getValue();
                res= (String)m.getKey();
            }

        }
        return res;
    }
}