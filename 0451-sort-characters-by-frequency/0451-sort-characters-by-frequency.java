class Solution {
    public String frequencySort(String s) {
        String res = sortByFrequencyHelper(s);
        return res;
    }

    private static String sortByFrequencyHelper(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        StringBuilder res = new StringBuilder();
        PriorityQueue<Character> maxHeap = new PriorityQueue<>(
                (freq1, freq2) -> freq.get(freq2) - freq.get(freq1)
        );
        for (char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char key : freq.keySet()){
            maxHeap.add(key);
        }
        while (!maxHeap.isEmpty()){
            char c = maxHeap.poll();
            int n = freq.get(c);
            String temp = new String("" + c).repeat(n);
            res.append(temp);
        }
        return res.toString();
    }
}