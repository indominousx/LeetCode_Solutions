class Solution {
    public int minCost(int[][] g) {
        int m=g.length;
        int n=g[0].length;
        // This is 3D DP Question
        int[][][] dp = new int[m][n][1024];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return memoization(g,m-1,n-1,g[m-1][n-1],dp);
        // return recursive(g,m-1,n-1,g[m-1][n-1]);
    }
    public int memoization(int[][] g,int i, int j, int xor , int[][][] dp){
          if(i<0 || j<0) return Integer.MAX_VALUE;
          if(i==0 && j==0) return xor;
          if(dp[i][j][xor]!=-1) return dp[i][j][xor];
          int minresult=Integer.MAX_VALUE;
          if(j-1>=0){
          int left=memoization(g,i,j-1,xor^g[i][j-1],dp);
             minresult=Math.min(minresult,left);}
          if(i-1>=0){   
          int above=memoization(g,i-1,j,xor^g[i-1][j],dp);
             minresult=Math.min(minresult,above);
          }   
          return dp[i][j][xor]=minresult;
         
    }
    public int recursive(int[][] g , int i , int j,int xor){
        if(i==0 && j==0) return xor;
        int minresult=Integer.MAX_VALUE;
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(j-1>=0){
        int left = recursive(g,i,j-1,xor^g[i][j-1]);
        minresult=Math.min(minresult,left);
        }
        if(i-1>=0){
        int above=recursive(g,i-1,j,xor ^ g[i-1][j]);
        minresult=Math.min(minresult,above);
        }
        return minresult;
    }

}