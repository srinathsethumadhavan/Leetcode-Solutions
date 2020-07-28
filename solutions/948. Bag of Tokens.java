class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int points=0;
        int i=0;
        int j=tokens.length-1;
        int maxPoints = 0;
        while(i<=j){
            if(P>=tokens[i]){
                points++;
                P-=tokens[i];
                i++;
                maxPoints = Math.max(maxPoints,points);
            }else if(points>0){
                P+=tokens[j];
                j--;
                points--;
                
            }
            else
                return maxPoints;
        }
        return maxPoints;
    }
}
