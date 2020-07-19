class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int total=numBottles;
        int remaining=0;
        int initial =numBottles;
        while(initial>=numExchange){
            remaining = initial/numExchange;
            total+=remaining;
            initial=remaining+(initial%numExchange);
        }
        return total;
    
    }
}