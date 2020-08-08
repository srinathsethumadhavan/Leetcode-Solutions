class Solution {
    public String findLongestWord(String s, List<String> d) {
        Collections.sort(d,(a,b)-> a.compareTo(b));
        String word = "";
        int length = Integer.MIN_VALUE;
        for(int i=0;i<d.size();i++){
             
            if(isSubsequence(d.get(i),s) && d.get(i).length()>length){
                length = Math.max(d.get(i).length(),length);
                word = d.get(i);
            }
        }
        
        return word;
    }
    
    public boolean isSubsequence(String s,String t){
        int m = s.length();
        int n = t.length();
        int i=0;
        int j= 0;
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        return i==m;
    }
}
