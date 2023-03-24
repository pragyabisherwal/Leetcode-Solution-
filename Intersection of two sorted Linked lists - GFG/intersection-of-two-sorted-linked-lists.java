//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
class GfG
{
    static Scanner sc = new Scanner(System.in);
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        
        head = tail = new Node(val);
        
        size--;
        
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
        {
            
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n , m;
                    
                    n = sc.nextInt();
                    m = sc.nextInt();
                    
                    Node head1 = inputList(n);
                    Node head2 = inputList(m);
                    
                    Sol obj = new Sol();
                    
                    Node result = obj.findIntersection(head1, head2);
	    
	                printList(result);
	                System.out.println();
                }
        }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
       Node merge = new Node(-1);
       Node pt3=merge;
       
       Node pt1=head1;
       Node pt2=head2;
       
       
       while(pt1!=null && pt2!=null)
       {
           if(pt1.data==pt2.data)
           {
             Node add = new Node(pt1.data);
             merge.next=add;
             merge=merge.next;
             pt1=pt1.next;
             pt2=pt2.next;
             
           }
           
           else if(pt1.data>pt2.data)
           {
             pt2=pt2.next;
           }
           
           else if(pt1.data<pt2.data)
           {
             pt1=pt1.next;
          
           }
       }
       
       return pt3.next;
    }
}