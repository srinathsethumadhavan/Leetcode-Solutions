class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i)))
                upper++;
          
        }
        
        if(upper==word.length())
            return true;
        else if(upper==1 && (Character.isUpperCase(word.charAt(0))))
                return true;
                else if (upper==0)
            return true;
        
        return false;
    }
}