// Rod Cutting
class Solution{
    public int helper(int price[], int n, int j,int []memo){
        //code here
    if(j==n){
            return 0;
        }
        if(j>n) return -1;
        
        if(memo[j]!=-1) return memo[j];
        int ans=0;
        for(int i=1; i<=n; i++){
            int temp=helper(price, n, j+i,memo);
            if(temp==-1) break;
            ans=Math.max(ans, temp+price[i-1]);
        }
        memo[j]=ans;
        return ans;
        }
    public int cutRod(int price[], int n) {
        int memo[]=new int[n+1];
  
            Arrays.fill(memo, -1);
            
        return helper(price , n, 0,memo);
    }
}