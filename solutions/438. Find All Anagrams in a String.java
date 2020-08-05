class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> list= new ArrayList<>();
        Set<String> set = new HashSet<>();
        
        int[] countp = new int[26];
        for(int i=0;i<p.length();i++)
            countp[p.charAt(i)-'a']++;
        set.add(Arrays.toString(countp));
        
        for(int i=0;i<s.length()-p.length()+1;i++)
        {
            int[] count = new int[26];
            for(int j=0;j<p.length();j++)
              count[s.charAt(j+i)-'a']++;             
           
            if(set.contains(Arrays.toString(count)))
                list.add(i);
        }
            return list;
    }
    
}
