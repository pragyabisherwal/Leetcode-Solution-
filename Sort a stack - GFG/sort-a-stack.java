// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public void merge(Stack<Integer> s , int temp)
	{
	   if(s.size()==0 || temp > s.peek())
	   {
	       s.push(temp);
	       return;
	   }
	   
	   int elem = s.pop();
	   merge(s , temp);
	   s.push(elem);
	}
	
	public Stack<Integer> sort(Stack<Integer> s)
	{
	   if(s.size()==0)
	    return s;
	    
	   int temp = s.pop();
	   sort(s);
	   merge(s , temp);
	   
	   return s;
	}
}