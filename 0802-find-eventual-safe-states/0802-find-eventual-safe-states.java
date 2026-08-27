class Solution {
    public List<Integer> eventualSafeNodes(int[][] nums) {
        List<List<Integer>> revls = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            revls.add(new ArrayList<>());
         }
         int[] ind = new int[nums.length];
         for(int i=0;i<nums.length;i++){
            for(int it : nums[i]){
                revls.get(it).add(i);
                ind[i]+=1;
            }
         }
         Queue<Integer> q = new LinkedList<>();
         List<Integer> ls = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
            if(ind[i]==0){
                q.add(i);
            }
         }
         while(!q.isEmpty()){
            int node=q.poll();
            ls.add(node);
            for(int it:revls.get(node)){
                ind[it]--;
                if(ind[it]==0) q.add(it);
            }
         }
         Collections.sort(ls);
         return ls;
    }
}