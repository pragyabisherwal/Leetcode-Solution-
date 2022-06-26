class MyQueue {
    
    Stack <Integer> st1;
    Stack <Integer> st2;
    
    public MyQueue() 
    {
       st1 = new Stack<>();  
       st2 = new Stack<>();  
    }
    
    public void push(int x) 
    {
        while(st1.size()!=0)
        {
            int val = st1.pop();
            st2.push(val);
        }
        
        st1.push(x);
        
        while(st2.size()!=0)
        {
            int val = st2.pop();
            st1.push(val);
        }
        
        
    }
    
    public int pop() 
    {
        if(st1.size()==0)
            return -1;
        
        int ans =st1.pop();
        
        return ans;
        
        
    }
    
    public int peek() {
        
        if(st1.size()==0)
            return -1;
        
        int ans = st1.peek();
        
        return ans;
    }
    
    public boolean empty()
    {
        if(st1.size()==0)
            return true;
        
        else
            return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */