class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] tm=new int[arr.length];
        for(int i=0;i<arr.length;i++){
             tm[i]=arr[i];
        }
        int t=1;
        Arrays.sort(tm);
        for(int i=0;i<arr.length;i++){
            if(hm.get(tm[i])==null){
               hm.put(tm[i],t);
               t++;
            } 
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr; 
    }
}