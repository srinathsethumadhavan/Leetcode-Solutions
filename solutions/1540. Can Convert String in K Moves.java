class Solution {
     public boolean canConvertString(String s, String t, int k) {
        
         Map<Integer, Integer> map = new HashMap<>();
        int m = s.length();
         int n = t.length();
         int prev = 0;
        if (m != n) return false;
        for (int i = 0; i < m; i++) {
            int dist = getDist(s.charAt(i), t.charAt(i));
             int prevCnt = map.getOrDefault(dist, 0);
            if (dist > 0) map.put(dist, prevCnt + 1);
            if (prevCnt * 26 + dist > k) return false; 
        }
        return true;
    }
    
    private int getDist(char a, char b) {
        int dist = b - a;
        return (dist + 26) % 26;
    }
}
