
class Solution {
    class Pair implements Comparable<Pair>{
    int first;
    int second;

    Pair(int first,int second)
    {
        this.first = first;
        this.second = second;
    }
    @Override
    public int compareTo(Pair other) {
        if (this.first != other.first) {
            return Integer.compare(this.first, other.first);
        } else {
            return Integer.compare(this.second, other.second);
        }
    }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<arr.length;i++)
        {
            maxHeap.offer(new Pair(Math.abs(x-arr[i]), arr[i]));

            if(maxHeap.size()>k)
                maxHeap.poll();
        }

        List<Integer> res = new ArrayList<>();
         while (!maxHeap.isEmpty()) {
            res.add(maxHeap.poll().second);
        }

        Collections.sort(res);

        return res;
    }
}
