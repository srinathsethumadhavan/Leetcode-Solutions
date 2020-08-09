class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        
        long rect1Area = ((long)C-(long)A)*((long)D-(long)B);
        
        long rect2Area = ((long)G-(long)E)*((long)H-(long)F);
        
        long overlapArea = Math.max((long)Math.min(G,C)-(long)Math.max(A,E),0) *
                          Math.max((long)Math.min(D,H)-(long)Math.max(B,F),0);
        
      return (int)(rect1Area+rect2Area - overlapArea);
                          
    }
}
​
/*
ALGORTIHM
we need to return the area of the 2 rectnagles when overlapped 
so we need to add the area of both rectangle and subtract the common area otherwise common area is calculated twice.
​
now to calculate the common area we need the X and Y cordinates 
we take the max of x coordinates on the left  and min of x coordinates on the right
subtacting both we will get the base;
similarly for y axix, we do and get breadth
multiply both and get the overlapped area
now the handle the case  where the rectnagle do not overlap ,  we will get negative we take 0 
so that overlppaed are is zero
*/
