class Solution {
    public boolean isSubsequence(String s, String t) {

        int m = s.length();
        int n = t.length();
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(t.charAt(i)==s.charAt(j))
                j++;
            i++;
        }
        
        return j==m;
        
        
        
        //         int n = s.length();
//         int m = word.length();
//         int i=0;
//         int j=0;
//         while(i<m && j<n){
//             if(s.charAt(j)==word.charAt(i)){
//                 j++;
//             }
//             i++;
            
//         }
//         return j==n;
    }
}