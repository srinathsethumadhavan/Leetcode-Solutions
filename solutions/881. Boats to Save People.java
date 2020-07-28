class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j=people.length-1;
        int numBoats = 0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            }else
                j--;
            numBoats++;
        }
        return numBoats;
    }
}
​
​
/*
sort the array
pair the heaviset person with the lighest person if possible
increment both i and j if both can be in the boat
else decrement only j
continue until i and j meet
*/
​
​
