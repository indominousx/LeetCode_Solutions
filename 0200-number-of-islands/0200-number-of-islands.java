class Pair{
    int f;
    int s;
    public Pair(int f , int s){
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public void bfs(int r , int c , int[][] vis , char[][] grid){
        vis[r][c]=1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(r,c));
        int n=grid.length;
        int m=grid[0].length;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        while(!q.isEmpty()){
            Pair current = q.poll();
            int row=current.f;
            int col=current.s;
            for(int i=0;i<4;i++){
                    int nrow=row+drow[i];
                    int ncol=col+dcol[i];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]=='1' && vis[nrow][ncol]==0){
                        vis[nrow][ncol]=1;
                        q.add(new Pair(nrow,ncol));
                    }
                }
            
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis=new int[n][m];
        int cnt=0;
        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(vis[row][col]==0 && grid[row][col]=='1'){
                    cnt+=1;
                    bfs(row,col,vis,grid);
                }
            }
        }
        return cnt;
    }
}