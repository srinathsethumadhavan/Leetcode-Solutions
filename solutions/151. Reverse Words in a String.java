class Solution {
    public String reverseWords(String s) {
        StringBuffer sbr = new StringBuffer(s);
        sbr.reverse();
        String S = new String(sbr);
       String[] str = S.split("\\s++");
        for(int i=0;i<str.length;i++){
            StringBuffer sb = new StringBuffer(str[i]);
            sb.reverse();        
            str[i]=new String(sb);          
        }
      
        return String.join(" ",str).trim();
    }
}
