class Solution {
    
     HashMap<String,Integer> hm = new HashMap<>();
    
    int eggDrop(int n, int k) 
	{
	  if(k==0 || k==1)  
	   return k;
	   
	  if(n == 1)    
	    return k;
	    
	  String key = n+" "+k;
	  
	  if(hm.containsKey(key))   
	  return hm.get(key);
	  
	  int min=Integer.MAX_VALUE;
	  
	  for(int i=1;i<=k;i++)
	  {
	      int temp = 1 + Math.max(eggDrop(n-1,i-1),eggDrop(n,k-i));
	      min = Math.min(min,temp);
	  }
	  
	  hm.put(key,min);
	  return min;
	}
    public int twoEggDrop(int n)
    {
        return eggDrop(2 , n);
    }
}