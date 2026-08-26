class Solution {
    public boolean check(int st , int v , int[][] graph , int[] color){
       Queue<Integer> q = new LinkedList<>();
       q.add(st);
       color[st]=0;
       while(!q.isEmpty()){
        int num = q.poll();
        for(int node : graph[num]){
            if(color[node]==-1){
                color[node]=1-color[num];
                q.add(node);
            }
            else if(color[node]==color[num]) return false;
        }
       }
       return true;
    }
    public boolean isBipartite(int[][] graph) {
     int[] color = new int[graph.length];
     for(int i=0;i<graph.length;i++) color[i]=-1;
     for(int i=0;i<graph.length;i++){
        if(color[i]==-1){
            if(!check(i,graph.length,graph,color)) return false;
        }
     }   
     return true;
    }
}