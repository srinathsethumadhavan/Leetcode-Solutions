class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder(""+n);
        sb.reverse();
         StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<sb.length();i++)
        {
            if(i%3==0)
               sb2.append("."); 
            sb2.append(sb.charAt(i));
        }
        return  sb2.reverse().delete(sb2.length()-1,sb2.length()).toString();
    }
}
