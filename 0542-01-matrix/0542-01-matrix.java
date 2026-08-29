class Node{
    int x;
    int y;
    int dis;
    Node(int x , int y , int dis){
        this.x=x;
        this.y=y;
        this.dis=dis;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
      int m=mat.length;
      int n=mat[0].length;
      Queue<Node> q = new LinkedList<>();
      int[][] dist= new int[m][n];
      int[][] vis= new int[m][n];
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==0){
                q.add(new Node(i,j,0));
                vis[i][j]=1;
            }
        }
      }
      int[] xcor = new int[]{-1,0,1,0};
      int[] ycor = new int[]{0,1,0,-1};
      while(!q.isEmpty()){
        Node curr = q.poll();
        int x = curr.x;
        int y =curr.y;
        int dis=curr.dis;
        dist[x][y]=dis;
        for(int i=0;i<4;i++){
            int nx  = x+xcor[i];
            int ny= y+ycor[i];
            if(nx>=0 && nx<m && ny>=0 && ny<n && vis[nx][ny]==0 && mat[nx][ny]==1){
                q.add(new Node(nx,ny,dis+1));
                vis[nx][ny]=1;
            }
        }
      } 
      return dist;
    }
}