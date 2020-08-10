class Solution {
    public int numSub(String s) {
        String [] ones = s.split("0++");
        long total=0;
        long n =0;
        for(int i=0;i<ones.length;i++){
            
            n = ones[i].length();
            total+= (n*(n+1))/2;
        }
        return (int)(total%1000000007);
    }
}
