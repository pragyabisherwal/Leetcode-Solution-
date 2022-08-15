

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        int n = nums1.length;
        int m = nums2.length;
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0;
        int j=0;
        
        HashSet<Integer> al = new  HashSet<> ();
        
        while(i<n && j<m)
        {
            if(nums1[i]==nums2[j])
            {
                al.add(nums1[i]);
                i++;
                j++;
            }
            
           else if(nums1[i]>nums2[j])
            {
                j++;
            }
            
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
        }
        
        int sz=al.size();
        System.out.println(sz);
        
        int [] res = new int[sz];
        int k=0;
        
        for(int ele : al)
        {
            res[k]=ele;
            k++;
        }
        return res;
        
        
    }
}