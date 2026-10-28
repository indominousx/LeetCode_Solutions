class Solution {
    public int countBattleships(char[][] b) {
        int m=b.length;
        int n=b[0].length;
        int cnt=0;
        int[][] vis = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(b[i][j]=='X' && vis[i][j]!=1){
                    cnt+=1;
                    dfs(b,vis,i,j);
                }
            }
        }
        return cnt;
    }
    public static void dfs(char[][] b, int[][] vis , int i, int j){
        int m=b.length;
        int n=b[0].length;
        vis[i][j]=1;
        int[] x=new int[]{0,1,0,-1};
        int[] y=new int[]{-1,0,1,0};
        for(int k=0;k<4;k++){
            int nx=i+x[k];
            int ny=j+y[k];
            if(nx>=0 && nx<m && ny>=0 && ny<n && b[nx][ny]=='X' && vis[nx][ny]!=1){
                // vis[i][j]=1;
                dfs(b,vis,nx,ny);
            }
        }
    }
}