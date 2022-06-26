class MyStack {

    Queue <Integer> qu;
    
    
    public MyStack() {
       qu = new LinkedList <> ();
    
    }
    
    public void push(int x) 
    {
       qu.add(x);
      int count = qu.size()-1;
        
        while(count>0)
        {
            int val = qu.remove();
            qu.add(val);

            count--;
    }



    }
    
    public int pop() 
    {
        if(qu.size()==0)
             return -1;
        
        int result = qu.peek();
        qu.remove();
        
        return result;
    }
    
    public int top() 
    {
        if(qu.size()==0)
             return -1;
        
        int result = qu.peek();
        
        return result;
        
    }
    
    public boolean empty() {
        if(qu.size()==0)
             return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */