class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0)
            return 0;
        if(isPalindrome(s)==true)
            return 1;
        return 2;
        
    }
    
    public static boolean isPalindrome(String st){
        int i=0;
        int j = st.length()-1;
        while(i<j){
            if(st.charAt(i)!=st.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

//since only and b are there we can remove all a then all b to make it empty because subsequence is allowed.