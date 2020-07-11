class Solution {
    public String sortString(String s) {
        int[] ascVals = new int[26];
		int count = s.length();
		
		for(char c: s.toCharArray()) {
			ascVals[c-'a']++;
		}
		
		StringBuilder sb = new StringBuilder();
		while (count > 0) {
			for (int i =0; i< 26; i++) {
				if(ascVals[i] > 0) {
					sb.append((char)(i+'a'));
					ascVals[i]--;
					count--;
				}
			}
			for (int i = 25; i >= 0; i--) {
				if(ascVals[i] > 0) {
					sb.append((char)(i+'a'));
					ascVals[i]--;
					count--;
				}
			}
		}
		return sb.toString();
        
    }
    
}