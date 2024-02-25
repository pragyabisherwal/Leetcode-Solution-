class Solution {
	public int[] arrayRankTransform(int[] arr) {
		//USING PRIORITY QUEUE AND HASHMAP
		int n= arr.length;
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i=0; i<n; i++)
		   pq.add(arr[i]);
		HashMap<Integer,Integer> map= new HashMap<>();
		int count=1;
		while(!pq.isEmpty())
		{
			int val= pq.remove();
			if(!map.containsKey(val))
			{
				map.put(val,count);
				count++;
			} 
		}
		for(int i=0; i<n; i++)
		{
			arr[i]=map.get(arr[i]);
		}
		return arr;
	}
}