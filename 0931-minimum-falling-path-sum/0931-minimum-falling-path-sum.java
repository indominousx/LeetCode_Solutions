class Solution {
    public int minFallingPathSum(int[][] mat) {
     if(mat[0].length==1) return mat[0][0];   
     int min=Integer.MAX_VALUE;
     int n=mat[0].length;
     int[][] dp = new int[n][n];
     for(int j=0;j<n;j++){
        dp[n-1][j]=mat[n-1][j];
     }
      for(int i=n-2;i>=0;i--){
        for(int j=0;j<n;j++){
            int ld;
            if(j-1<0) ld=Integer.MAX_VALUE;
            else ld=dp[i+1][j-1];
            int rd;
            if(j+1>=n) rd=Integer.MAX_VALUE;
            else rd=dp[i+1][j+1];
            int sd=dp[i+1][j];
            dp[i][j]=mat[i][j]+Math.min(sd,Math.min(ld,rd));
        }
      }
    //   int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
      min=Math.min(min,dp[0][i]);
    }
    return min;
    
    
    
    
    
    //  Integer[][] dp = new Integer[n][n];  
    //  for(int i=0;i<n;i++){
    //   min=Math.min(min,memoization(0,i,mat,dp));
    //  }
    //  return min;

    //  for(int j=0;j<n;j++){
    //     min=Math.min(min,recursive(0,j,mat));
    //  }    
    //  return min;
    }
    public int memoization(int i,int j, int[][] mat ,Integer[][] dp){
      if(j<0 || j>=mat[0].length) return Integer.MAX_VALUE;
      if(i==mat.length-1) return mat[i][j];
      if(dp[i][j]!=null) return dp[i][j];
      int ld=memoization(i+1,j-1,mat,dp);
      int sdown=memoization(i+1,j,mat,dp);
      int rd=memoization(i+1,j+1,mat,dp);
      dp[i][j]=mat[i][j]+Math.min(ld,Math.min(sdown,rd));
      return dp[i][j];
    }


    public int recursive(int i , int j ,int[][] mat){  
      if(j<0 || j>=mat[0].length) return Integer.MAX_VALUE;
      if(i==mat.length-1) return mat[i][j];
      int ld=recursive(i+1,j-1,mat);
      int sdown=recursive(i+1,j,mat);
      int rd=recursive(i+1,j+1,mat);
      return mat[i][j]+Math.min(ld,Math.min(sdown,rd));   
    }
}