class Solution {
    public boolean isAnagram(String s, String t) {
        
        char tempArray1[] = s.toCharArray(); 
        char tempArray2[] = t.toCharArray(); 
       
        Arrays.sort(tempArray1); 
        Arrays.sort(tempArray2);   
      
         String s1 = new  String(tempArray1); 
        
        
         String s2 = new String(tempArray2); 
​
        return s1.equals(s2);
    }
}
