class Solution {
    public String arrangeWords(String text) {
      
        
        String st= text.substring(0, 1).toLowerCase() + text.substring(1);
        String [] str =  st.split(" ") ;
        Arrays.sort(str,(a,b)-> a.length()-b.length());
        String s =  String.join(" ",str) ;
        return  s.substring(0, 1).toUpperCase() + s.substring(1);
        
      
    }
}
