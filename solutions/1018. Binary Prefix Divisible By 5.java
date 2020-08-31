class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
       
        ArrayList<Boolean>list = new ArrayList<>();
        int remainder =0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==0)
                remainder= (remainder*2)%5;
            else
              remainder= (remainder*2+1)%5;
            if(remainder==0)
                list.add(true);
            else
                list.add(false);
        }
            
      
           return list;
    }
}
​
/*
When a binary number is appended by 0 , the new remainder can be calculated based on current remainder only.
remainder = (remainder * 2) % 5;
​
And when a binary number is appended by 1.
remainder = (remainder * 2 + 1) % 5;
​
For example:
If it is appended by 0 it will become 10 (2 in decimal) means twice of the last value.
If it is appended by 1 it will become 11(3 in decimal), twice of last value +1.
*/
