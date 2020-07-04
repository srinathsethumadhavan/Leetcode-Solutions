class Solution {
    public int myAtoi(String str) {
        int i=0;
       long result=0;
       int sign=1;
        if(str.length()==0)
            return 0;
            
        while(i<str.length() &&str.charAt(i)==' ' ){
            i++;
        }
        if(i>=str.length())
            return 0;
        if(str.charAt(i)=='-'||str.charAt(i)=='+'){
            sign = str.charAt(i) =='-'?-1:1;
            i++;
        }
       for(;i<str.length();i++){
            if(!(str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9))
                break;
                result=result*10+(str.charAt(i)-'0');
           
           if(result*sign<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
               else if(result*sign>Integer.MAX_VALUE)
                   return  Integer.MAX_VALUE;
        }
        return (int)result*sign;
    }
}