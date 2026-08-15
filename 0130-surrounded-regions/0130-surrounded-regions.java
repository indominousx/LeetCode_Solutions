class Solution {
    public void dfs(int r , int c, int[][] vis , int[] drow , int[] dcol , char[][] mat){
       vis[r][c]=1;
       int m=mat.length;
       int n=mat[0].length;
       for(int i=0;i<4;i++){
        int nrow=r+drow[i];
        int ncol=c+dcol[i];
        if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0 && mat[nrow][ncol]=='O'){
            vis[nrow][ncol]=1;
            dfs(nrow,ncol,vis,drow,dcol,mat);
        }
       }

    }
    public void solve(char[][] mat) {
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        int m=mat.length;
        int n=mat[0].length;
        int[][] vis = new int[m][n];
        // First and Last Row
        for(int j=0;j<n;j++){
            if(vis[0][j]==0 && mat[0][j]=='O'){
                dfs(0,j,vis,drow,dcol,mat);
            }
            if(vis[m-1][j]==0 && mat[m-1][j]=='O'){
                dfs(m-1,j,vis,drow,dcol,mat);
            }
        }
        // First and Last Column
        for(int i=0;i<m;i++){
            if(vis[i][0]==0 && mat[i][0]=='O'){
                dfs(i,0,vis,drow,dcol,mat);
            }
            if(vis[i][n-1]==0 && mat[i][n-1]=='O'){
                dfs(i,n-1,vis,drow,dcol,mat);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && mat[i][j]=='O'){
                    mat[i][j]='X';
                }
            }
        }
    }
}