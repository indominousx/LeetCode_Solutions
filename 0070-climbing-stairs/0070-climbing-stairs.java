class Solution {
    // public int rec(int n){
    //     if(n==0) return 1;
    //     if(n==1) return 1;
    //     int left= rec(n-1);
    //     int right=rec(n-2);
    //     return left+right;
    // }
    // TLE for Recursion case.
   public int memo(int n , int[] dp){
       if(n==0) return 1;
       if(n<0) return 0;
       if(dp[n]!=-1) return dp[n];
       int oneS = memo(n-1,dp);
       int twoS= memo(n-2,dp);
       dp[n]=oneS+twoS;
       return dp[n];
   } 
   
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        // arr[0]=1;
        // arr[1]=1;
        return memo(n,arr);
    }
}