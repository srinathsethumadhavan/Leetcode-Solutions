class Solution {
    public int romanToInt(String s) {
     
        int total = 0;
        HashMap<Character,Integer> map = new HashMap<>();
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        
        for(int i=0;i<s.length();i++)
        {
            int currentInt = map.get(s.charAt(i));
            int nextInt= -1;
            if(i+1<s.length())
                nextInt= map.get(s.charAt(i+1));
            
            if(nextInt!=-1)
            {
                if(currentInt<nextInt){
                    total+=nextInt-currentInt;
                    i++;
                }
                else
                    total+=currentInt;
            }
            else
                total+=currentInt;
                
        }
        return total;
    }
}
​
/*
​
We compare the current integer and the next Integer. if the current i nteger is smaller than the next integer, then do the subtraction and increment i, for loop will automaticlaly add 1 increment making the required itncrements at the end of each loop.
if the current Int is smaller than the next int , simply add the current int.
check whehte ru have a valid next Int to avoid null pointer exception
​
*/
