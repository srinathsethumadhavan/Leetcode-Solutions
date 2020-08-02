class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        String[] str = path.split("/");
        for(String s : str){
            if(!stack.isEmpty() && s.equals(".."))
                stack.pop();
            else if(!s.equals(".") && !s.equals("") && !s.equals(".."))
                stack.push(s);
        }
        ArrayList<String> list = new ArrayList<>(stack);
        
        
        return "/"+String.join("/",list);
    }
}
