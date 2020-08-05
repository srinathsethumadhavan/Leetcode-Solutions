class Solution {
    public String entityParser(String text) {
        StringBuilder sb = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        map.put("&quot;","\"");
         map.put("&apos;","'");
         map.put("&amp;","&");
         map.put("&gt;",">");
         map.put("&lt;","<");
         map.put("&frasl;","/");
        
        for(int i=0;i<text.length();i++){
            char c =text.charAt(i);
            if(c=='&')
            {
                for(int j=i+1;j<text.length();j++)
                {
                    char d = text.charAt(j);
                    if(d==';')
                    {
                        String S =text.substring(i,j+1);
                        if(map.containsKey(S))
                           sb.append(map.get(S));
                    
                        else
                            sb.append(S);
                    
                    i=j;
                    break; 
                    }
                }               
             }else
                sb.append(c);
        }
        return sb.toString();
       
    }
    
    
}
​
​
​
/* A SIMPLE ONE LINE SOLUTION 
 return 
            text.replaceAll("&quot;", "\"")
            .replaceAll("&apos;", "'")
            .replaceAll("&gt;", ">")
            .replaceAll("&lt;", "<")
            .replaceAll("&frasl;", "/")
            .replaceAll("&amp;", "&");
*/
