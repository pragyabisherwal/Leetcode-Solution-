/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public void randomPointer(Node head) {
        
        Node curr = head;
        
        while(curr!=null)
        {
            Node random = curr.random;
            
            if(random!=null)
                curr.next.random = random.next;
            
            curr = curr.next.next;
        }
        
        
    }
    public Node copyRandomList(Node head) {
        Node curr = head;
        
        while(curr!=null)
        {
            Node forw=curr.next;
            Node node = new Node(curr.val);
            curr.next=node;
            node.next=forw;
            
            curr=forw;
        }
        
        randomPointer(head);
        
        Node dummy= new Node(-1);
        Node prev = dummy;
        Node currF = head;
        
        while(currF!=null)
        {
            prev.next=currF.next;
            currF.next=currF.next.next;
            
            prev = prev.next;
            currF=currF.next;
        }
        
        return dummy.next;
    }
}