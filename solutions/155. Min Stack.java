class MinStack {

    /** initialize your data structure here. */
    
    Stack<Integer> main = new Stack<>();
    Stack<Integer> aux = new Stack<>();
        
    
    public void push(int x) {
        
          main.push(x);
        if(aux.isEmpty() || aux.peek()>=main.peek())
            aux.push(x);
       
       
    }
    
    public void pop() {
        
        if(aux.peek().equals(main.peek()))
            aux.pop();
        main.pop();
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
       return  aux.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */