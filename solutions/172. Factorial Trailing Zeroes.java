class Solution {
    public int trailingZeroes(int n) {
        int numberOfZeros = 0;
        while(n>=5){
            numberOfZeros += n/5;
            n=n/5;
        }
        return numberOfZeros;
    }
}
​
/*
count the numbe of 5 i the factorial
​
eg ;
25! =  1 2 3 4 5 6 7 8 9 10 
11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
​
5 -1
10 -1
15 -1
20-1
25- 2
total 6 5's 
hence total zeros in 25!= 6
​
*/
​
