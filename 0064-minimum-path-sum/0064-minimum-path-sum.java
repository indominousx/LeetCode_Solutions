class Solution {
    public int minPathSum(int[][] g) {
        int m=g.length;
        int n=g[0].length;
        int cost=0;
        int[][] dp = new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         dp[i][j]=-1;
        //     }
        // } 
        dp[0][0]=g[0][0];
          for(int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+g[i][0];
          }
          for(int j=1;j<n;j++){
            dp[0][j]=dp[0][j-1]+g[0][j];
          }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int min=Math.min(dp[i-1][j],dp[i][j-1]);
                dp[i][j]=g[i][j]+min;
            }
        }
        return dp[m-1][n-1];

        // return memoization(g,m-1,n-1,dp);

        // return recursive(g,m-1,n-1,cost);
        
    }

    public int memoization(int[][] g , int i , int j , int[][] dp){
       if(i==0 && j==0) return g[0][0];
       if(i<0 || j<0) return Integer.MAX_VALUE;
       if(dp[i][j]!=-1) return dp[i][j];
       int min=Math.min(memoization(g,i-1,j,dp),memoization(g,i,j-1,dp));
       dp[i][j]=g[i][j]+min;
       return dp[i][j];
    }

    public int recursive(int[][] g , int i , int j , int cost){
      if(i==0 && j==0) return g[0][0];
      if(i<0 || j<0) return Integer.MAX_VALUE;
      int min=Math.min(recursive(g,i,j-1,cost),recursive(g,i-1,j,cost));
      cost+=g[i][j]+min;
      // remove variable cost 
      // and return like this 
      // return g[i][j]+Math.min(recursvie(g,i,j-1),recursive(g,i-1,j));
      return cost;
    }
}