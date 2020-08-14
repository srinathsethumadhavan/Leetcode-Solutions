class Solution {
    public int maxScore(String s) {
        String left = "";
        String right = "";
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length()-1;i++)
        {
            left = s.substring(0,i+1);
            right= s.substring(i+1,s.length());
              
           int a = countZeros(left);
           int b =  countOnes(right);
            max = Math.max(a+b,max); 
        }
        
          return max;
    }
    
    public int countZeros(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='0')
                count++;
        return count;
    }
     public int countOnes(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='1')
                count++;
        return count;
    }
}
