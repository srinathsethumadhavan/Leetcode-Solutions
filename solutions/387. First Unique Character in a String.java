class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0 || s==null)
            return -1;
       int result = Integer.MAX_VALUE;
        char [] c =s.toCharArray();
        int [] hash = new int[26];
        for(int i=0;i<26;i++)
            hash[i]=-1;
        for(int i=0;i<c.length;i++)
        {
           if( hash[ c[i]-'a']==-1)
             hash[ c[i]-'a']=i;
            else
              hash[ c[i]-'a']=-2;
        }
        for(int i=0;i<26;i++)
        {
            if(hash[i]>=0)
            result = Math.min(hash[i],result);
            }
                return result==Integer.MAX_VALUE?-1:result;
        
        
    }
}
