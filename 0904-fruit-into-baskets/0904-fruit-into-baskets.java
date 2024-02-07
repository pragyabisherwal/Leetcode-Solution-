class Solution {
    public int totalFruit(int[] fruits) {
        int i=0 , j=0 , fruit=0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        int n = fruits.length;
        
        
        while(j<n)
        {
            hm.put(fruits[j] , hm.getOrDefault(fruits[j] , 0)+1);
            
            if(hm.size()<=2)
            {
                fruit = Math.max(fruit , j-i+1);
                j++;
            }
            
            else if(hm.size()>2)
            {
                while(hm.size()>2)
                {
                    int val = hm.get(fruits[i]);
                    val--;
                    
                    if(val==0)
                        hm.remove(fruits[i]);
                    
                    else
                        hm.put(fruits[i] , val);
                    
                    i++;
                    
                }
                j++;
            }
        }
        
        return fruit;
        
    }
}