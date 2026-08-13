class Node{
    int xcor;
    int ycor;
    int height;
    Node(int xcor , int ycor, int height){
        this.xcor=xcor;
        this.ycor=ycor;
        this.height=height;
    }
}
class Solution {
    public int[][] highestPeak(int[][] iW) {
        Queue<Node> q = new LinkedList<>();
        int m = iW.length;
        int n = iW[0].length;
        int[][] vis=new int[m][n];
        int[][] ans = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(iW[i][j]==1){
                    vis[i][j]=1;
                    q.add(new Node(i,j,0));
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!q.isEmpty()){
            Node curr= q.poll();
            int x =curr.xcor;
            int y =curr.ycor;
            int height=curr.height;
            ans[x][y]=height;
            for(int i=0;i<4;i++){
                int nrow=x+drow[i];
                int ncol=y+dcol[i];
                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && vis[nrow][ncol]==0){
                    vis[nrow][ncol]=1;
                    q.add(new Node(nrow,ncol,height+1));
                }
            }
        }
        return ans;
    }
}