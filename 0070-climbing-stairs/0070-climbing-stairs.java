class Solution {
    // public int rec(int n){
    //     if(n==0) return 1;
    //     if(n==1) return 1;
    //     int left= rec(n-1);
    //     int right=rec(n-2);
    //     return left+right;
    // }
    // TLE for Recursion case.


    // Memoization
//    public int memo(int n , int[] dp){
    //    if(n==0) return 1;
    //    if(n<0) return 0;
    //    if(dp[n]!=-1) return dp[n];
    //    int oneS = memo(n-1,dp);
    //    int twoS= memo(n-2,dp);
    //    dp[n]=oneS+twoS;
    //    return dp[n];
//    } 
   
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        // arr[0]=1;
        // arr[1]=1;
        // return memo(n,dp);
        dp[0]=1;
        if(n>=1) dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
         return dp[n];
    }
}