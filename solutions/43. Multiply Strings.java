class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] val = new int[m+n];
        
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum= val[i+j+1]+mul;
                val[i+j+1]=sum%10;
                val[i+j]+=sum/10;
                
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int v :val){
            if(sb.length()!=0 ||v!=0)
                sb.append(v);
        }
        
       
        return sb.length()==0?"0":sb.toString();
    }
}