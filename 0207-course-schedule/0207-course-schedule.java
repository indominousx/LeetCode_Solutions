class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] ind = new int[numCourses];
        for(int[] num : pre){
            adj.get(num[1]).add(num[0]);
            ind[num[0]]++;
        }
        int cnt=0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int num=q.poll();
            cnt+=1;
            for(int nextnode : adj.get(num)){
                ind[nextnode]--;
                if(ind[nextnode]==0) q.add(nextnode);
            }

        }
        return cnt==numCourses;

    }
}