class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] charMap = new int[26];
        for(int i=0;i<order.length();i++)
            charMap[order.charAt(i)-'a']=i;
    
    
    for(int i=1;i<words.length;i++)
    if(compare(words[i-1],words[i],charMap)>0)
        return false;
    return true;
       }
       
       public int compare(String word1,String word2, int[] charMap){
           int charVal=0;
           int i=0;
           int j=0;
           while(i<word1.length() && j<word2.length() && charVal==0){
               charVal = charMap[word1.charAt(i)-'a']-charMap[word2.charAt(j)-'a'];
               i++;
               j++;
           }
           if(charVal==0)
           {
               return word1.length()-word2.length();
           }
           return charVal;
       }
       
}
/*

ALGORITHM:

1. make a charMap array and get the index order;
2 . compare two words at one time 
3. compare the first characte in the first and second string
4. if it is sorted as per the given order we will get negative as charVal and exit the loop and return the same.
5. if all the letters are same in both the string then the charVla is 0 and then check the length of second string is larger than the first stirng. we will ger +ve val if it is the case . if not -ve is returend
*/