class Solution {
    public int uniquePaths(int m, int n) {
       int[][] dp = new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
       }
    //    Arrays.fill(dp,-1);
       return memoization(dp,m-1,n-1);
       
       
        // return recursive(m-1,n-1);
    }

    public int memoization(int[][] dp , int i , int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]=memoization(dp,i,j-1)+memoization(dp,i-1,j);
        return dp[i][j];
    }
    public int recursive(int i , int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        int goLeft=recursive(i,j-1);
        int goAbove=recursive(i-1,j);
        return goLeft+goAbove;
    }
}