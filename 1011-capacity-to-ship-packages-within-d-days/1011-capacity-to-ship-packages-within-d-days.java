class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = weights[0];
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (max < weights[i]) {
                max = weights[i];
            }
        }
        int start = max; // Minimum possible weight
        int end = sum;   // Maximum possible weight
        while (start < end) {
            int mid = start + (end - start) / 2;
            int minDay = daysRequired(weights, mid);
            if (minDay <= days) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private int daysRequired(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;
        for (int weight : weights) {
            if (currentLoad + weight <= capacity) {
                currentLoad += weight;
            } else {
                days++;
                currentLoad = weight;
            }
        }
        return days;
    }
}