class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] vis = new int[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0]=1;
        while(!q.isEmpty()){
            int curr=q.remove();
            for(int neigh: rooms.get(curr)){
                if(vis[neigh]!=1){
                vis[neigh]=1;
                q.add(neigh);
                }
            }
        } 
        for(int i=0;i<vis.length;i++){
            if(vis[i]==0) return false;
        }
        return true;
    }
}