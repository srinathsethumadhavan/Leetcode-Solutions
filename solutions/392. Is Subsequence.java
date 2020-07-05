class Solution {
    public boolean isSubsequence(String s, String word) {
        int n = s.length();
        int m = word.length();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(s.charAt(j)==word.charAt(i)){
                j++;
            }
            i++;
            
        }
        return j==n;
    }
}