class Solution {
    public int countPrimeSetBits(int L, int R) {
      
        int count=0;
        for(int i=L;i<=R;i++)
           if(isPrime(bitCount(i)))
              count++;
        return count;
    }
    
    private boolean isPrime(int n){
        if(n==1)
            return false;
       for(int i = 2; i <= n/2; ++i)
            if(n % i == 0)
              return false;
        return true;
    }
    private int bitCount(int n){
        int count =0;
        while(n>0)
        {
            if((n&1)!=0)
                count++;
            n>>=1;
        }
        return count;
    }
}
