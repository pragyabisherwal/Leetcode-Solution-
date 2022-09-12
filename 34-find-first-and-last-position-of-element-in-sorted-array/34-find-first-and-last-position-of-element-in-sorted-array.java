class Solution {
    public int[] searchRange(int[] a, int t) {
        int[] ans={-1,-1};
        ans[0]=search(a,t,true);
        if(ans[0]!=-1)ans[1]=search(a,t,false);
        return ans;
    }
    
    public static int search(int[] a,int t,boolean firstIndex)
    {
        int s=0;
        int e=a.length-1;
        
        int ans=-1;
        while(s<=e)
        {
            int m=s+(e-s)/2;
            
            if(a[m]>t)
                e=m-1;
            else if(a[m]<t)
                s=m+1;
            else{
                ans=m;
                if(firstIndex)e=m-1;
                else s=m+1;
            }
        }
        return ans;
    }
}