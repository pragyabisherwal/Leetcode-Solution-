class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        if(nums1.length>nums2.length)
        {
             int[] temp = nums1;
             nums1= nums2;
             nums2= temp;
        }
        
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        if(nums1.length == 0 && nums2.length ==0)
              return 0;
        
        int lo=0;
        int hi=n1;
        
        while(lo<=hi)
        {
            int cut1=lo+((hi-lo)/2);
            int cut2=(n1+n2)/2-cut1;
            
             double l1 = cut1==0?Integer.MIN_VALUE : nums1[cut1-1];
             double l2 = cut2==0?Integer.MIN_VALUE : nums2[cut2-1];
            
            
             double r1 = cut1==n1?Integer.MAX_VALUE : nums1[cut1];
             double r2 = cut2==n2?Integer.MAX_VALUE : nums2[cut2];
            
            if(l1>r2)
                hi=cut1-1;
            
            else if(l2>r1)
                lo=cut1+1;
            
            else
            {
                if(((n1+n2)%2) == 0) return ((Math.max(l1,l2) + Math.min(r1,r2)) / 2);
                else return Math.min(r1,r2);
            }
   
        }
        
        return 0;
    }
}