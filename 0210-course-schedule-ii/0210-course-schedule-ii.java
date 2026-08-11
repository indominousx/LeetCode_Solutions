class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
         List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] ind = new int[numCourses];
        for(int[] num : pre){
            adj.get(num[1]).add(num[0]);
            ind[num[0]]++;
        }
        List<Integer> ls = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0) q.add(i);
        }
        int[] order= new int[numCourses];
        int idx=0;
        while(!q.isEmpty()){
            int num=q.poll();
            ls.add(num);
            order[idx++]=num;
            for(int nextnode : adj.get(num)){
                ind[nextnode]--;
                if(ind[nextnode]==0) q.add(nextnode);
            }
        }
        if(ls.size()!=numCourses) return new int[0];
        return order;
    }
}