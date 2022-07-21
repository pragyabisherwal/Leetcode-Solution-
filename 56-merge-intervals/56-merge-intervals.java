class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals , (a , b)->{
            return a[0]-b[0];
        });
        
        Stack <int[]> st = new Stack<> ();
        st.push(intervals[0]);
        
        for(int i=1;i<intervals.length;i++)
        {
            int s1=intervals[i][0];
            int e1=intervals[i][1];
            
            int []t=st.pop();
            
            int s2=t[0];
            int e2=t[1];
            
            int max=Math.max(e1,e2);
            
            if(e2>=s1)
            {
                int []temp ={s2 , max};
                st.push(temp);
            }
            
            else
            {
                st.push(t);
                st.push(intervals[i]);
            }
            
        }
        
         int[][]result = new int[st.size()][2];
            
            for(int i=result.length-1 ; i>=0 ; i--)
            {
                    int []t = st.pop();
                    result[i][0]=t[0];
                    result[i][1]=t[1];
                
            }
        
        return result;
    }
}