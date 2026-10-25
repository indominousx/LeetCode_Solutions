class Solution {
    public int closedIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis = new int[m][n];
        for(int i=0;i<m;i++){
            if(grid[i][0]==0 && vis[i][0]==0) dfs(grid,i,0,m,n,vis);
            if(grid[i][n-1]==0 && vis[i][n-1]==0) dfs(grid,i,n-1,m,n,vis);
        }
        for(int j=0;j<n;j++){
           if(grid[0][j]==0 && vis[0][j]==0) dfs(grid,0,j,m,n,vis);
            if(grid[m-1][j]==0 && vis[m-1][j]==0) dfs(grid,m-1,j,m,n,vis);
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0 && vis[i][j]==0){
                    ans+=1;
                    dfs(grid,i,j,m,n,vis);
                }
            }
        }
        return ans;
    }
    public void dfs(int[][] grid , int i, int j, int m , int n , int[][] vis){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==1 || vis[i][j]==1) return;
        vis[i][j]=1;
        dfs(grid,i-1,j,m,n,vis);
        dfs(grid,i+1,j,m,n,vis);
        dfs(grid,i,j-1,m,n,vis);
        dfs(grid,i,j+1,m,n,vis);
    }
}