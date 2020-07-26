class Solution {
    public boolean isSubsequence(String s1, String s2) {
​
        int m = s1.length();
        int n = s2.length();
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(s1.charAt(i)==s2.charAt(j))
                i++;
            j++;
        }
        
        return i==m;
        
        // check if s1 is a subsequence of s2
        
        //         int n = s.length();
//         int m = word.length();
//         int i=0;
//         int j=0;
//         while(i<m && j<n){
//             if(s.charAt(j)==word.charAt(i)){
//                 j++;
//             }
//             i++;
            
//         }
//         return j==n;
    }
}
