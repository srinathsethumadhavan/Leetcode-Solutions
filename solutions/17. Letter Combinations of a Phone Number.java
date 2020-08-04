class Solution {
     List<String> result =new ArrayList<>();
     String[] mapping ={
            "0",
            "1",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };
    public List<String> letterCombinations(String digits) { 
        if(digits.length()==0 || digits==null)
            return result;
        String current ="";
    letterCombinations(current,0,digits); 
        return result;
    }
    
    
​
public void letterCombinations(String current,int index, String digits){
    if(index==digits.length())
    {
        result.add(current);
        return;
    }
    String letters = mapping[digits.charAt(index)-'0'];
    for(int i=0;i<letters.length();i++)
        letterCombinations(current+letters.charAt(i),index+1,digits);
    
} 
}
