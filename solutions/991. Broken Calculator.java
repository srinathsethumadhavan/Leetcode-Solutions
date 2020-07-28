class Solution {
    public int brokenCalc(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            
            if (Y % 2 == 1)
                Y++;
            else
                Y /= 2;
            ans++;
        }
​
        return  ans +X-Y;
    
    }
}
​
/*
approach from backwards
5->8
while(y >x)
when y is even divide it by 2 
when y is odd, add 1 to it
keep incrementing answer
finally we need to 
8/2=4
4>5 false
so we need to add (5-4) =1 addition to the answer 
*/
