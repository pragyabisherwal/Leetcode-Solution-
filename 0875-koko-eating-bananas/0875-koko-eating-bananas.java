class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int start = 1;
        int end =  max;
    
        while(start<end){
            int mid = start + (end-start) / 2;
            if(koko(mid,piles)>h){
                start = mid + 1;
          }
            else{
                end=mid;
            }
        }
        return start;
    }


    public int koko(long num, int[] arr){
    int sum = 0;
    for(int i = 0; i < arr.length; i++){
        sum += Math.ceil((double)arr[i]/num);
    }
    return sum;
}

}
