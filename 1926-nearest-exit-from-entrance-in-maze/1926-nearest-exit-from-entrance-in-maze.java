class Node{
    int x;
    int y;
    int dist;
    Node(int x , int y , int dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}
class Solution {
    public int nearestExit(char[][] maze, int[] en) {
        Queue<Node> q = new LinkedList<>();
        // int d = 0;
        int min_dist=Integer.MAX_VALUE;
        int[] nx = new int[]{-1,0,1,0};
        int[] ny = new int[]{0,1,0,-1};
        int[][] vis = new int[maze.length][maze[0].length];
        vis[en[0]][en[1]]=1;
        q.add(new Node(en[0],en[1],0));
        while(!q.isEmpty()){
            Node curr=q.poll();
            int x = curr.x;
            int y=curr.y;
            int d=curr.dist;
            for(int i=0;i<4;i++){
                int dx=x+nx[i];
                int dy=y+ny[i];
             if(dx>=0 && dx<maze.length && dy>=0 && dy<maze[0].length && maze[dx][dy]!='+' && vis[dx][dy]!=1){   
                    if(dx==0 || dx==maze.length-1 || dy==0 || dy==maze[0].length-1){
                    return d+1;
                }
                    vis[dx][dy]=1;
                    q.add(new Node(dx,dy,d+1));
                }
            }
        }
      return -1;
    }
}