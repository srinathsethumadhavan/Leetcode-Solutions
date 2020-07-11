class Solution {
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        for(int i: candies)
            set.add(i);
            return Math.min(set.size(),candies.length/2);
        }
    
}

/*
T(n) = O(n)
Space(n) = O(n) in worset case if all the elements are unique 

the maximum number of candies the gril has to get is n/2 since both brother and sister need to have same # candies.
to maximize the differnet kinds of candis , all the unique candies has to be givent to the girl itself;
so we need to find the min # candies . suppose the unique # candies can be large than n/2. in that case we take the minimum of unique # of candies and the number of candiesto be given for the girl(n/2)
*/