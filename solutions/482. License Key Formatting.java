class Solution {
    public String licenseKeyFormatting(String S, int K) {
           int i = S.length()-1;
        StringBuilder sb = new StringBuilder();
        int count =0;
        while(i>=0){
            char curr = Character.toUpperCase(S.charAt(i));
            if(curr=='-')
                i--;
            
            else if(count!=0 && count%K ==0)
            { sb.insert(0,'-');
             count=0;
            }
                else {
                    sb.insert(0,curr+"");
                    i--;
                     count++;
            
                }
           
        }
        
        return sb.toString();
    }
}