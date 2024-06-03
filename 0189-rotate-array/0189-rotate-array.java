class Solution {

    public void rotate(int[] nums, int k) 
    {
        if(k==0)
            return;
        
        int n = nums.length;
        
        if(k>n)
            k=k%n;
        
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    
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
}