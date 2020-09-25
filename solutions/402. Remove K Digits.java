public class Solution {
    public String removeKdigits(String num, int k) {
        
        //corner case
        if(k==num.length())        
            return "0";
            
        Stack<Character> stack = new Stack<>();
        int i =0;
        for(char c: num.toCharArray()){
            //whenever meet a digit which is less than the previous digit, discard the previous one
            while(k>0 && !stack.isEmpty() && stack.peek()>c){
                stack.pop();
                k--;
            }
            stack.push(c);
            
        }
        
        // corner case like "1111"
        while(k-->0)
            stack.pop();
                    
  
        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        
        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}
