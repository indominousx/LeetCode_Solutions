class Solution {
    public void dfs(int[][] g , int[][] vis , int row , int col , int[] drow , int[] dcol){
          vis[row][col]=1;
          int m=g.length;
          int n=g[0].length;
          for(int i=0;i<4;i++){
            int nrow=row+drow[i];
            int ncol=col+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && g[nrow][ncol]==1){
                dfs(g,vis,nrow,ncol,drow,dcol);
            }
          }
    }
    public int numEnclaves(int[][] g) {
       int[] drow={-1,0,1,0};
       int[] dcol={0,1,0,-1};
       int m=g.length;
       int n=g[0].length;
       int[][] vis = new int[m][n];
       // first and last col
       for(int i=0;i<m;i++){
           if(g[i][0]==1 && vis[i][0]==0){
             dfs(g,vis,i,0,drow,dcol);
           }
           if(g[i][n-1]==1 && vis[i][n-1]==0){
            dfs(g,vis,i,n-1,drow,dcol);
           }
       }
       // first and last row
       for(int j=0;j<n;j++){
        if(g[0][j]==1 && vis[0][j]==0){
            dfs(g,vis,0,j,drow,dcol);
        }
        if(g[m-1][j]==1 && vis[m-1][j]==0){
            dfs(g,vis,m-1,j,drow,dcol);
        }
       }
       int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]==1 && vis[i][j]==0){
                    cnt+=1;
                }
            }
        }
       return cnt; 
    }
}