class Solution {
    public String customSortString(String S, String T) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        for(int i=0;i<T.length();i++)
            map.put(T.charAt(i),map.getOrDefault(T.charAt(i),0)+1);
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<S.length();i++)
        {
            int count = map.getOrDefault(S.charAt(i),0);
            for(int j=0;j<count;j++)
                sb.append(Character.toString(S.charAt(i)));
            map.remove(S.charAt(i));
        }
        for(Map.Entry m: map.entrySet())
        {
            for(int j=0;j<(Integer)m.getValue();j++)
                sb.append(Character.toString((Character)m.getKey()));
        }
         return sb.toString();                 
    }
}
