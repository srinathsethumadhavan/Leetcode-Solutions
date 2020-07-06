class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        int count =0;
        
        String [] mc =  {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(int i=0;i<words.length;i++){
            String  str="";
            for(char ch : words[i].toCharArray())
            str+=mc[ch-'a'];
            if(!set.contains(str))
                count++;
            set.add(str);
                
        }
        return count;
    }
}