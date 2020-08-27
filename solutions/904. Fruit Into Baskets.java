class Solution {
    public int totalFruit(int[] trees) {
        
        int lastFruit = -1;
        int secondLastFruit = -1;
        int lastFruitCount =0;
        int currentMax =0;
        int max = 0;
        
        for(int fruit : trees){
            if(fruit==lastFruit || fruit == secondLastFruit)
                currentMax++;
            else
                currentMax =lastFruitCount+1;
            if(fruit==lastFruit)
                lastFruitCount++;
            else
                lastFruitCount =1;
            if(fruit!=lastFruit)
            {
                secondLastFruit = lastFruit;
                lastFruit = fruit;
            }
            max = Math.max(currentMax,max);
​
        }
        return max;
    }
}
​
​
/*
this is same problem as finding the 
​
longest contigous subarray with 2  distinct characters
longest substirng of the given string with 2 distinct character
​
*/
