class Solution {
    public String makeGood(String s) {
     
        
        
        // for(int i = 0;i<s.length()-1;i++){
        //     if(Math.abs(s.charAt(i)-s.charAt(i+1))==32)
        //         return makeGood(s.substring(0,i)+s.substring(i+2));
        // }
        // return s;
        
        
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(stack.isEmpty()!=true && Math.abs(stack.peek()-c)==32)
                stack.pop();
            else
                stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(stack.isEmpty()!=true)
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
