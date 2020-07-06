class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0 &&x<=9)
            return true;
        if(x<0)
            return false;
       int n=x;
        int reverse=0,r;
        while(n>0){
            r=n%10;
            n=n/10;
            reverse=(reverse*10)+r;
        }
        if(x==reverse)
            return true;
        else
            return false;
        
    }
}