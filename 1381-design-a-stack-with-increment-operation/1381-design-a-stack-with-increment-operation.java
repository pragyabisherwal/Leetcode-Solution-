class CustomStack {
    
    int top=-1;
    int size=0;
    int [] arr;
    
    public CustomStack(int maxSize) 
    {
        arr = new int[maxSize]; 
        size=maxSize;
        
    }
    
    public void push(int x) 
    {
        if(top==arr.length-1)
            return;
        
        top=top+1;
        arr[top]=x;
        
    }
    
    public int pop() 
    {
        if(top==-1)
            return -1;
        
        int ans = arr[top];
        top--;
        
        return ans;
    }
    
    public void increment(int k, int val) 
    {
        if(k>size)
        {
           for(int i=0 ; i<size ; i++)
            arr[i]+=val;   
        }
        
        else
        {
          for(int i=0 ; i<k ; i++)
            arr[i]+=val;   
        }
       
            
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */