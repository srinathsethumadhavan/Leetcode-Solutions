class Solution {
    public int[] shortestToChar(String s, char C) {
       int [] output= new int [s.length()];
        int pos = Integer.MIN_VALUE/2;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==C)
                pos=i;
            output[i]=i-pos;
        }
      pos= Integer.MAX_VALUE;;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==C)
                pos=i;
            output[i]=  Math.min(output[i],pos-i);
        }
        return output;
    }
}