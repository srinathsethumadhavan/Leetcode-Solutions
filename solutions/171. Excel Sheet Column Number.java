class Solution {
    public int titleToNumber(String s) {
        
        int k=0;
        int result = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
             
            result+=(s.charAt(i)-'A'+1)*Math.pow(26,k++);
        }
        return result;
    }
}
​
​
​
/*
​
convert with base as 26
​
*/
