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
    public int shortestPathBinaryMatrix(int[][] g) {
        if(g[0][0]!=0 || g[g.length-1][g.length-1]!=0) return -1;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.dist,b.dist));
        int[][] d= new int [g.length][g[0].length];
        for(int[] r : d){
            Arrays.fill(r,Integer.MAX_VALUE);
        }
        d[0][0]=1;
        pq.add(new Node(0,0,1));

        // for(int i=-1;i<=1;i++){
        //     for(int j=-1;j<=1;j++){

        //     }
        // }
         int[][] direction = {{-1,-1},{-1,0},{-1,1},
                        {0,-1},{0,1},
                        {1,-1},{1,0},{1,1}};
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            int x=curr.x;
            int y=curr.y;
            int dist=curr.dist;
            if(x==g.length-1 && y==g[0].length-1) return dist;
            if(dist>d[x][y]) continue;
            for(int[] dir : direction){
                int nx = x+dir[0];
                int ny = y+dir[1];
                if(nx>=0 && nx <= g.length-1 && ny >=0 && ny<=g[0].length-1 && g[nx][ny]==0){
                    if(dist+1<d[nx][ny]){
                        d[nx][ny]=dist+1;
                        pq.add(new Node(nx,ny,dist+1));
                    }
                }
            } 
        }                
        return -1;
    }
}