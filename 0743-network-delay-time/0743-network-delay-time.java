class Node{
    int x;
    int dist;
    Node(int x, int dist){
        this.x=x;
        this.dist=dist;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Node>> ls = new ArrayList<>();
        for(int i=0;i<=n;i++){
            ls.add(new ArrayList<>());
        }
        for(int[] edge: times){
            ls.get(edge[0]).add(new Node(edge[1],edge[2]));
        }
        int[] dis= new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k]=0;
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->Integer.compare(a.dist,b.dist));
        pq.add(new Node(k,0));
        while(!pq.isEmpty()){
            Node curr = pq.poll();
            int u =curr.x;
            int distance=curr.dist;
            if(distance>dis[u]) continue;
            for(Node neighbour : ls.get(u)){
                int v = neighbour.x;
                int w=neighbour.dist;
                if(dis[u]+w<dis[v]){
                    dis[v]=w+dis[u];
                    pq.add(new Node(v,dis[v]));
                }
            }
        }
        int mT=0;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            mT=Math.max(dis[i],mT);
        }
        return mT;
    }
}