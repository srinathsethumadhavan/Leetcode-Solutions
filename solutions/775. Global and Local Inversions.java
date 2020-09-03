class Solution {
    public boolean isIdealPermutation(int[] A) {
        int max = -1;
        for(int i=0;i<A.length-2;i++)
        {
            max = Math.max(max,A[i]);
        if(max>A[i+2])
            return false;
        }  
        return true;
    }
    
}
​
​
/*
​
we have to find one global maximum which is not a local maximum
if we find one global maximum like that we can simply return false;
​
Because the count of local should <= count of global, all we care is when local < global happens.
The difference between local and global is global also include nonadjacent i and j, so simplify the question to for every i, find in range 0 to i-2, see if there is a element larger than A[i], if it exist, we can return false directly. and we can maintain a variable max for the linear implementation.
*/
