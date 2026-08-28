class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        if(s==d) return true;
        List<List<Integer>> ls = new ArrayList<>();
        int[] vis = new int[n];
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        for(int[] g: edges ){
            ls.get(g[0]).add(g[1]);
            ls.get(g[1]).add(g[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vis[s]=1;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int dest : ls.get(curr)){
                if(dest==d) return true;
             if(vis[dest]!=1){   
                vis[dest]=1;
                q.add(dest);
            }
            }

        }
        return false;
    }
}