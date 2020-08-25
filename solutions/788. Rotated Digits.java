class Solution {
    public int rotatedDigits(int N) {
        int count=0;
        String s ="";
        for(int i=1;i<=N;i++)
        {   
            s = i+"";
            if(s.contains("3")||s.contains("4")||s.contains("7"))
                continue;
            if(s.contains("2")||s.contains("5")||s.contains("6")||s.contains("9"))
                count++;
        }
        return count;
    }
}
