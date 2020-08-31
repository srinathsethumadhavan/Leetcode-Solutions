class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder s = new StringBuilder("0");
        System.out.println(s);
        for(int i=1;i<n;i++)
        {
             StringBuilder original =new StringBuilder(s);
             s=original.append("1").append(invert(s).reverse());
         
        }
       return  s.charAt(k-1);
    }
    
    public StringBuilder invert(StringBuilder sb){
         StringBuilder temp = new StringBuilder();
        for(int i=0;i<sb.length();i++)
            if(sb.charAt(i)=='1')
                temp.append("0");
             else
                temp.append("1");
        return temp;
    }
}
