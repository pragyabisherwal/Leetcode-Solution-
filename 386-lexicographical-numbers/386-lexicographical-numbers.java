class Solution {
    List<Integer> al;
    public void dfs(int i , int n)
    {
        if(i>n)
            return ;
        
        al.add(i);
        
        for(int j=0 ; j<10 ; j++)
        {
            dfs(10*i+j , n);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        al = new ArrayList<>();
        
        for(int i=1 ; i<=9 ; i++)
        {
            dfs(i , n);
        }
        
        return al;
    }
}