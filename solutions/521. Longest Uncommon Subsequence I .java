class Solution {
    public int findLUSlength(String a, String b) {
          if(a.equals(b))
            return -1;
        else if(a.length()==b.length())
            return a.length();
        else 
            return Math.max(a.length(),b.length());
    }
}
​
​
/*
three cases are there for the problem
case1 :
1.
both the strigns are equal-> return -1 bcz no uncoomon subsequence is available
2.
both the strings are not the same but the lengths are same -> return length of a or length of b
3.
both the strings length are differnet-> return the maximum length of both the strings
​
​
A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements
an empty string is a subsequence of every string
every stirng is a subsequence of the same string
​
​
*/
