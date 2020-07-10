class Solution {
    public int minMoves(int[] nums) {
        int min =nums[0];
        int sum=0;
        for(int i: nums)
           min = Math.min(i,min);
        for(int i=0;i<nums.length;i++)
            sum+=nums[i]-min;
        return sum;
    }
}


/*

let's define sum as the sum of all the numbers, before any moves; minNum as the min number int the list; n is the length of the list;
After, say m moves, we get all the numbers as x , and we will get the following equation
 sum + m * (n - 1) = x * n
and actually,
  x = minNum + m
and finally, we will get
  sum - minNum * n = m
before all elements reach to the same value, every time (n-1) elements add one meaning only one element remains the same, which of cause should be the max value( should be different from min value, otherwise they have reached the same value) of the array. So, with that being said, every time doing add one for (n-1) operation, the min value +1. If it takes m moves to reach x, then x=minNum+m.


Let me explain why x = minNum + m
our goal is :increment minNum to be equal to maxNum
No matter how many add operations are executed,the goal won't change.
Every time we do the add operation,the min number in the array must participate in.
After an add operation,the minNum is still the min number
So the minNum participate in every add operation
So x = minNum + m



*/