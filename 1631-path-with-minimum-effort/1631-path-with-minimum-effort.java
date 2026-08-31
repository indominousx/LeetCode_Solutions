class Node{
    int x;
    int y;
    int effort;
    Node(int x , int y , int effort){
        this.x=x;
        this.y=y;
        this.effort=effort;
    }
}
class Solution {
    public int minimumEffortPath(int[][] h) {
       PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.effort,b.effort));
       int[][] mE = new int[h.length][h[0].length]; 
       for(int[] r : mE){
        Arrays.fill(r,Integer.MAX_VALUE);
       }
       mE[0][0]=0;
       pq.add(new Node(0,0,0));
       int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
       while(!pq.isEmpty()){
        Node curr = pq.poll();
        if(curr.x==h.length-1 && curr.y ==h[0].length-1){
            return curr.effort;
        }
        if(curr.effort>mE[curr.x][curr.y]){
          continue;
        }
        for(int[] d : dir){
            int nx = curr.x + d[0];
            int ny = curr.y + d[1];
        
        if(nx>=0 && nx<h.length && ny>=0 && ny<h[0].length){
            int diff = Math.abs(h[curr.x][curr.y]-h[nx][ny]);
            int neweffort=Math.max(curr.effort,diff);
            if(neweffort<mE[nx][ny]){
                mE[nx][ny]=neweffort;
                pq.add(new Node(nx,ny,neweffort));
            }
        }
        }
       }      
         return 0; 
     }
}