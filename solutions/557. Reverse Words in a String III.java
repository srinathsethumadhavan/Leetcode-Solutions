class Solution {
    public String reverseWords(String s) {
        String [] str =s.split(" ");
        for(int i=0;i<str.length;i++)
      
            str[i]=new StringBuffer(str[i]).reverse().toString();  
            
        StringBuffer sb = new StringBuffer();
        for(String st : str)
            
                sb.append(st+" ");
        
      
        
        return sb.toString().trim();
    }
    
   
}