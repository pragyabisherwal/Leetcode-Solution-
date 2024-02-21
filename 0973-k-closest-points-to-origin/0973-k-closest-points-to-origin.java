class Solution {
    public int[][] kClosest(int[][] points, int k) 
    {   
        if(k == points.length) return points;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (p1,p2)->Integer.compare(p2[0]*p2[0]+p2[1]*p2[1],p1[0]*p1[0]+p1[1]*p1[1])
        );
            
        for(int i=0 ; i<points.length ; i++)
        {
            pq.add(points[i]);
            
            if(pq.size()>k)
                pq.remove();
        }
        
        int[][] ans = new int[k][2];
        k--;
        
        while(pq.size()>0)
        {
            ans[k]=pq.remove();
            k--;
        }
        
        return ans;
    }
}