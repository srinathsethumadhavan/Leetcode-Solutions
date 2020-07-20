class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum =0;
        Arrays.sort(costs, new Sortbydiff());
        for(int i=0;i<costs.length/2;i++)
            sum+=costs[i][0];
        for(int i=costs.length/2;i<costs.length;i++)
            sum+=costs[i][1];  
        return sum;
    }

}

class Sortbydiff implements Comparator<int[]>{
    public int compare(int[] o1, int[] o2)
    {
            int o1Save = o1[0] - o1[1];  
            int o2Save = o2[0] - o2[1];  
            return o1Save >  o2Save ? 1 : -1; 
        }
} 

/*
How much money can we save if we fly a person to A vs. B? To minimize the total cost, we should fly the person with the maximum saving to A, and with the minimum - to B.

P1 [10, 20] -> 10 - 20 = -10 
P2 [30, 200] -> 30 - 200 = -170 
P3 [400, 50] -> 400 - 50 = 350 
P4 [30, 20] -> 30 - 20 = 10 

Sort based on the cost of diff of sending A to B -> -170, -10, 10, 350 ([[30, 200], [10, 20], [30, 20], [400, 50]])
P2 P1 P4 P3 -> A = P2, P1 -> 30 + 10 = 40 
               B = P4, P3 -> 20 + 50 = 70 
			   A + B = 40 + 70 = 110
*/