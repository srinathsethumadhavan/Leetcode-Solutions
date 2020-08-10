class Solution {
    public int countOdds(int low, int high) {
       
        if(low==high)
        {
            if(low%2==0)
                return 0;
            else
                return 1;
        }
        if(low%2==0)
            low=low+1;
        int count=0;
        return (high-low)/2+1;
        
​
    }
}
​
/*
brute force solution
​
first check if the low is odd or even
if low is even, add 1 to low
use loop to count all the odd numbers by incrementing it by 2 evry time
return the count
​
​
​
Efficient
​
using AP tn formula
tn = a+(n-1)d
​
explicitly handle the case where low == high 
if low is odd  return 1 as it is inclusive 
if low is even return 0;
*/
