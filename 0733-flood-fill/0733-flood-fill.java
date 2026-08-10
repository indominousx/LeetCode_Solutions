class Solution {
    // public void dfs(int[][] i, int[][] ans , int r , int c , int color , int[] delrow , int[] delcol , int inicol){
    //     ans[r][c]=color;
    //     int m=i.length;
    //     int n=i[0].length;
    //     for(int j=0;j<4;j++){
    //         int nr=r+delrow[j];
    //         int nc=c+delcol[j];
    //         if(nr>=0 && nr<m && nc>=0 && nc<n && i[nr][nc]==inicol && ans[nr][nc]!=color){
    //             dfs(i,ans,nr,nc,color,delrow,delcol,inicol);
    //         }
    //     }
    // }
    public int[][] floodFill(int[][] i, int sr, int sc, int color) {
        int inicol=i[sr][sc];
        int[][] ans = i;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,1,0,-1};
        int m=i.length;
        int n=i[0].length;
        // dfs(i,ans,sr,sc,color,delrow,delcol,inicol);
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sr,sc});
        ans[sr][sc]=color;
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int x=curr[0];
            int y=curr[1];
            for(int j=0;j<4;j++){
                int nr=x+delrow[j];
                int nc=y+delcol[j];
                 if(nr>=0 && nr<m && nc>=0 && nc<n && i[nr][nc]==inicol && ans[nr][nc]!=color){
                  ans[nr][nc]=color;
                  q.add(new int[]{nr,nc});
                 }
            }
        }
        return ans;
    }
}