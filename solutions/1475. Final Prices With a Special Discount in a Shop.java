class Solution {
    public int[] finalPrices(int[] prices) {
        
        int i;
        int j;
        int n = prices.length;
        int flag =0;
        int[] discount = new int[n];
            for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(prices[j]<=prices[i])
                {
                    flag =1;
                    break;
                }
            }
            if(flag==1)               
                discount[i]=prices[i]-prices[j];
            
            else if(flag==0)
                discount[i]=prices[i];
                flag=0;
        }
        
        return discount;
    }
}