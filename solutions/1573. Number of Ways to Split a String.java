class Solution {
    public int numWays(String s) {
        
        long mod = 1000000007;
        long ones  =0;
        long n = s.length();
        
        for(char c : s.toCharArray())
            ones+=c-'0';
        if(ones==0)
            return (int)((((n-1)*(n-2))/2)%mod);
            if(ones%3!=0)
                return 0;
       
        long ways1 =0;
        long ways2 = 0;
            long oneThird = ones/3;
            ones = 0;
        for(char c : s.toCharArray())
        {
            ones+=c-'0';
            if(ones==oneThird)
                ways1++;
            if(ones==2*oneThird)
                ways2++;
        }
        return (int)((ways1*ways2)%mod);
    }
}
