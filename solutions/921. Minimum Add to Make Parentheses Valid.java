class Solution {
    public int minAddToMakeValid(String S) {
        int left=0;
        int right=0;
         for(char c : S.toCharArray())
        {
            if(c=='(')
                right++;
            
            else if(c==')' && right>0)
            
                right--;
            else 
                left++;
            
        }
        
        return left+right;
    }
}
​
​
/*
​
left records the number of ( we need to add on the left of S.
right records the number of ) we need to add on the right of S,
which equals to the number of current opened parentheses.
​
​
Loop char c in the string S:
if (c == '('), we increment right,
if (c == ')'), we decrement right.
When right is already 0, we increment left
Return left + right in the end
​
​
*/
