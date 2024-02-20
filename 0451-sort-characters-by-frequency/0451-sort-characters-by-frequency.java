class Solution {
    public String frequencySort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        HashMap<Character,Integer> val = new HashMap<>();
        Set<Character> key = val.keySet();
        for(int i = 0; i<arr.length; i++){
            int count = 1;
            while(i<arr.length-1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            val.put(arr[i],count);
        }
        StringBuilder fin = new StringBuilder();
        while(fin.length()< s.length()){
            int maxcount = 0;
            for(Character k : key){
                if(maxcount < val.get(k)){
                    maxcount = val.get(k);
                }
            }

            for(Character l : key){
                if(val.get(l) == maxcount){
                    for(int i = 1; i<=maxcount; i++){
                        fin.append(l);
                    }
                    val.put(l,0);
                }
            }
        }
        return fin.toString();
        
    }
}