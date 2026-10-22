class Solution {
    public int uniquePathsWithObstacles(int[][] oG) {
        if(oG[0][0]==1) return 0;     
        int m=oG.length;
        int n=oG[0].length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(oG[i][j]==1) dp[i][j]=1;
                dp[i][j]=-1;
            }
        }
        return memoization(oG,dp,m-1,n-1);
       
        // int m=oG.length-1;
        // int n=oG[0].length-1;
        // ------ Recursion ---------
        // return recursion(oG,m,n);
    }
    public int memoization(int[][] oG ,int[][] dp, int i , int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(oG[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]=memoization(oG,dp,i,j-1)+memoization(oG,dp,i-1,j);
        return dp[i][j];
    }


    public int recursion(int[][] gra , int i , int j){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
         if(gra[i][j]==1) return 0;
        int goLeft=recursion(gra,i,j-1);
        int goAbove=recursion(gra,i-1,j);
        return goLeft+goAbove;
    }
}