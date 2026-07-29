class Solution {
    public void dfs(int node , boolean vis[] , List<List<Integer>> adj ){
      vis[node] = true;
    //   ls.add(node);
      for(int i : adj.get(node)){
        if(!vis[i]){
            dfs(i,vis,adj);
        }
      } 
    }
    public int findCircleNum(int[][] mat) {
        List<List<Integer>> adjlist = new ArrayList<>();
        int v = mat.length;
        for(int i=0;i<v;i++){
         adjlist.add(new ArrayList<>());
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(mat[i][j]==1 && i!=j){
                adjlist.get(i).add(j);
                adjlist.get(j).add(i);}
            }
        }
        boolean vis[] = new boolean[v];
        int cnt=0;
        for(int i=0;i<v;i++){
            if(!vis[i]){
                cnt+=1;
                dfs(i,vis,adjlist);
            }
        }
        return cnt;
    }
}