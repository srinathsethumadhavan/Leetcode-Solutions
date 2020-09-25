class Solution {
    public int monotoneIncreasingDigits(int N) {
        String num = new String(N+"");
        char[] c = num.toCharArray();
        int len  = c.length;
        int marker = len;
        if(len==1)
            return N;
        
        for(int i=len-1;i>0;i--){
            if(c[i]<c[i-1]){
                marker=i;
                c[i-1]--;
            }
        }
        
        for(int i=marker;i<len;i++)
            c[i]='9';
        return Integer.parseInt((new String(c)));
    }
}
