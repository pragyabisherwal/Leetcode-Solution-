class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //Approach: Using Stack, T.C: O(n), S.C: O(n)
        int[] ans = new int[temperatures.length];

        //initialize the stack
        Stack<Integer> st = new Stack<>();

        //traverse
        for(int currDay = 0;currDay<temperatures.length;currDay++){
            /*while stack is not become empty and while we didn't found
            a lower temperature*/
            while(!st.isEmpty() &&
             temperatures[currDay]>temperatures[st.peek()]){
                 int prevDay = st.pop();
                 ans[prevDay] = currDay-prevDay;
             }
             //add to stack
             st.add(currDay);
        }
        return ans;
    }
}