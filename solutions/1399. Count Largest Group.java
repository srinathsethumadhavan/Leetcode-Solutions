class Solution {
    public int countLargestGroup(int n) 
    {
        int sumOfDigits =0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++)
        {
           sumOfDigits = sumDigits(i);
           map.put(sumOfDigits,map.getOrDefault(sumOfDigits,0)+1);
        } 
        int k=0;
        int [] arr = new int[map.size()];
        for(Map.Entry m : map.entrySet())
            arr[k++]=(int)m.getValue();
            
        
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        int total =0;
        for(Map.Entry m : map.entrySet())
        {    
            if((Integer)m.getValue()==max)
                total++;

        }
            return total;
   }  
        
     int sumDigits(int n)
    {
        int sum=0;
        while(n>0)
        {
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}