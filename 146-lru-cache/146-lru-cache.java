class LRUCache 
{
    class Node
    {
        int key;
        int value;
        
        Node next;
        Node prev;
        
        Node(int key , int value)
        {
            this.key = key;
            this.value=value; 
        }
    }
    
   HashMap <Integer , Node> hm = new HashMap<> ();
    Node head;
   Node tail;
   int capacity;
    
    public LRUCache(int capacity) 
    {
        this.capacity=capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        
        head.next=tail;
        tail.prev=head;
        
    }
    
    public int get(int key) 
    {
        Node temp = hm.get(key);
        
        if(temp==null)
            return -1;
        
        remove(temp);
        insert(temp);
        
        return temp.value;
    }
    
    public void put(int key, int value) 
    {
        if(hm.containsKey(key))
            remove(hm.get(key));
        
        if(hm.size()==capacity)
            remove(tail.prev);
        
        insert(new Node(key , value));
        
    }
    
    public void insert(Node temp)
    {
        hm.put(temp.key , temp);
        
        temp.next=head.next;
        head.next.prev=temp;
        temp.prev=head;
        head.next=temp;
    }
    
    public void remove(Node temp)
    {
        hm.remove(temp.key);
        
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */