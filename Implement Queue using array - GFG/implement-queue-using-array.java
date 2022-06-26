// { Driver Code Starts
import java.util.Scanner;

class GfG
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
		 {
			MyQueue obj = new MyQueue();
			int Q = sc.nextInt();
			while(Q>0)
			{
				int QueryType = 0;
				QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					
					obj.push(a);
					
				}else if(QueryType == 2)
				{
				System.out.print(obj.pop()+" ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		 }
	}
}



// } Driver Code Ends




class MyQueue {

    int front, rear;
    int n = 100005;
	int arr[] = new int[n];

    MyQueue()
	{
		front=-1;
		rear=-1;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if((rear+1)%n ==front)
	    {
	        return;
	    }
	    
	    if(front==-1) // first elemet in the array
	     front=0;
	     
	     rear=(rear+1)%n;
	     
	    arr[rear]=x;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		if(front==-1)
		return -1;
		
		int result = arr[front];
		
		if(front==rear)
		{
		    front=rear=-1;  //If only one elemt in the array
		}
		
		else
		 front=(front+1)%n;
		
		return result;
	} 
}




