class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int i=0;
       while(i<s.length()){
           if(i+1<s.length() && s.charAt(i)=='I'&& s.charAt(i+1)=='V')
           { res+=4;
             i+=2;
           }
           else if(i+1<s.length() &&s.charAt(i)=='I'&& s.charAt(i+1)=='X')
           {
               res+=9;
               i+=2;
           }
           else if(i+1<s.length() &&s.charAt(i)=='X'&& s.charAt(i+1)=='L')
           {  
            res+=40;
               i+=2;
           }
           else if(i+1<s.length() &&s.charAt(i)=='X'&& s.charAt(i+1)=='C')
           {
               res+=90;
               i+=2;
           }
           else if(i+1<s.length() &&s.charAt(i)=='C'&& s.charAt(i+1)=='D')
           {
               res+=400;
               i+=2;
           }
           else if(i+1<s.length() && s.charAt(i)=='C'&& s.charAt(i+1)=='M')
           {
               res+=900;
               i+=2;
           }
           else if(s.charAt(i)=='I')
           {
               res+=1;
               i++;
           }
            else if(s.charAt(i)=='V')
           {
               res+=5;
               i++;
           }
            else if(s.charAt(i)=='X')
           {
               res+=10;
               i++;
           }
            else if(s.charAt(i)=='L')
           {
               res+=50;
               i++;
           }
            else if(s.charAt(i)=='C')
           {
               res+=100;
               i++;
           }
           
            else if(s.charAt(i)=='D')
           {
               res+=500;
               i++;
           }
            else if(s.charAt(i)=='M')
           {
               res+=1000;
               i++;
           }
               
       } 
        
        return res;
    }
}