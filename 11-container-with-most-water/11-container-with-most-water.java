class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        
        int maxWater=0;
        
        while(i<j)
        {
            int area = Math.min(height[i] , height[j]);
            int width = j-i;
            
            int water = area*width;
            
            if(water>maxWater)
                maxWater=water;
            
            if(height[i] < height[j])
                i++;
            else
                j--;
     
        }
        
        return maxWater;
    }
}