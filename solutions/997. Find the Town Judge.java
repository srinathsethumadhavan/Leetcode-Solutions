class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] believe = new int[N+1];
        for(int[] pair : trust)
        {
            believe[pair[0]]--;
        believe[pair[1]]++;
        }
       for(int i=1;i<N+1;i++)
           if(believe[i]==N-1)
               return i;
            return -1;
        
    }
}
