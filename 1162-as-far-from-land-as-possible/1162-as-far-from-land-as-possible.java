class Node{
    int xcor;
    int ycor;
    int dist;
    Node(int xcor , int ycor , int dist){
        this.xcor=xcor;
        this.ycor=ycor;
        this.dist=dist;
    }
}
class Solution {
    public int maxDistance(int[][] mat) {
         int m=mat.length;
     int n=mat[0].length;
     int[][] vis = new int[m][n];
     int[][] distance = new int[m][n];
     Queue<Node> q = new LinkedList<>();
     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==1){
                q.add(new Node(i,j,0));
                vis[i][j]=1;
            }
            else{
                vis[i][j]=0;
            }
        }
     }
     int maxDist=0;
     int[] drow={-1,0,1,0};
     int[] dcol={0,1,0,-1};
     while(!q.isEmpty()){
        Node curr = q.poll();
        int x=curr.xcor;
        int y=curr.ycor;
        int d=curr.dist;
        distance[x][y]=d;
        maxDist=Math.max(maxDist,d);
        for(int i=0;i<4;i++){
            int nrow=x+drow[i];
            int ncol=y+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0){
                vis[nrow][ncol]=1;
                q.add(new Node(nrow,ncol,d+1));
            }
        }
     } 
     if(maxDist==0) return -1;
     return maxDist;
    }
}