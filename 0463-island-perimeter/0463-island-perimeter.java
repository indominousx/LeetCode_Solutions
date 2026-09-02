class Solution {
    public int islandPerimeter(int[][] g) {
        boolean[][] vis = new boolean[g.length][g[0].length];
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                 if(g[i][j]==1){
                   return dfs(g , vis , i ,j);
                 }
            }
        }
        return 0;
    }
    public int dfs(int[][] g , boolean[][] vis , int r , int col){
        if(r<0 || r>=g.length || col <0 || col>=g[0].length || g[r][col]==0){
            return 1;
        }
        if(vis[r][col]==true) return 0;
        vis[r][col]=true;
        int per=0;
        per+=dfs(g,vis,r,col-1);
        per+=dfs(g,vis,r-1,col);
        per+=dfs(g,vis,r,col+1);
        per+=dfs(g,vis,r+1,col);
        return per;
    }
}