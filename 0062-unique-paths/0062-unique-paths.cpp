class Solution {
public:
      int memoization(int i , int j ,  std::vector<std::vector<int>> &dp){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]=memoization(i-1,j,dp)+memoization(i,j-1,dp);
        return dp[i][j];
      }
public:
      int recursive(int i , int j){
       if(i==0 && j==0) return 1;
       if(i<0 || j<0) return 0;
       int goLeft=recursive(i,j-1);
       int goAbove=recursive(i-1,j);
       return goLeft+goAbove;
      }
public:
    int uniquePaths(int m, int n) {
        std::vector<std::vector<int>> dp(m,std::vector<int>(n,-1));
        
        return memoization(m-1,n-1,dp);
        // return recursive(m-1,n-1);
        return dp[0][0];
    }
};