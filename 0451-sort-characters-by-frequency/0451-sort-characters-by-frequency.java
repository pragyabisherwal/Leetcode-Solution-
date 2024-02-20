class Solution {
    class Pair{
        int a, c;
        public Pair(int a, int c){
            this.a = a;
            this.c = c;
        }
    }
    public String frequencySort(String s) {
        int n = s.length();
        StringBuilder wd = new StringBuilder();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i< n; i++){
            char ch = s.charAt(i);
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.c-a.c);
        for(Map.Entry<Character, Integer> e: hashMap.entrySet()){
            pq.offer(new Pair(e.getKey(), e.getValue()));
        }
        while(!pq.isEmpty()){
            Pair temp = pq.poll();
            int val = temp.c;
            while(val--!=0){
                wd.append((char)temp.a);
            }
        }
        return wd.toString();
    }
}