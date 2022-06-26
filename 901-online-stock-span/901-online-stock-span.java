class StockSpanner {
    public class stockNode{
       int index;
       int value;
        
       stockNode() {}
        
       stockNode(int value , int index)
       {
           this.value=value;
           this.index=index;
       }
    }
    
    Stack <stockNode> st;
    int time=0;
    
    public StockSpanner() 
    {
        st = new Stack ();
        // stockNode stock = new stockNode(Integer.MAX_VALUE , -1);
        // st.push(stock);   
    }
    
    public int next(int price) 
    {
        stockNode currStock = new stockNode(price, time);
        // st.push(currStock); 
          
        time++;
        
      while(st.size()!=0 && st.peek().value<=price)
      {
          st.pop();
      }
    
      int span=0;
      if(st.size()==0)
      {
          span = time;
      }
        
      else
      {
         int finalIdx=st.peek().index;
         span =currStock.index-finalIdx; 
      }
  
        st.push(currStock);
        return span;  
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */