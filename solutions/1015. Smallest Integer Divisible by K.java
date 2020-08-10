class Solution {
    public int smallestRepunitDivByK(int K) {
       if(K%2==0 || K%5==0)
           return -1;
​
 int r=0;
        
       for(int n =1;n<=K;n++)
       {
          r = (r*10+1)%K;
           System.out.println(r);
           if(r==0)
               return n;
       }
        return -1;
    }
}
​
​
/*
​
we only need to consider the first K candidates in [1, 11, 111, 1111, ...]
​
*/
