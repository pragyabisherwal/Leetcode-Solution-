class Solution {
    public int numRabbits(int[] answers) {
        int map[] =  new int[1000];
        
        for(int ele : answers){
            map[ele]+=1;
        }
        int rabbit =  0;
        
        for(int i=0;i<1000;i++)
        {
            int grpSize  = i+1;
            int rabbitsInGrp=  map[i];
            
            int count = (int) Math.ceil( (rabbitsInGrp*1.0)/grpSize ) * grpSize;
            rabbit+= count;            
        }
        return rabbit;
    }
}