class Solution {
    
    public void reverse(int[]a , int i , int j)
    {
        while(i<j)
        {
            int t = a[i];
            a[i]=a[j];
            a[j]=t;
            
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) 
    {
        if(k==0)
            return;
        
        int n = nums.length;
        
        if(k>n)
            k=k%n;
        
        reverse(nums,0 , n-k-1);
        reverse(nums,n-k , n-1);
        reverse(nums, 0 , n-1);
        
    }
}