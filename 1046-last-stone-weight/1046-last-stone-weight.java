class Solution {
    public int lastStoneWeight(int[] st) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<st.length;i++){
            pq.add(st[i]);
        }
        // int temp=pq.poll();
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        if(!pq.isEmpty()) return pq.poll();
        return 0;
    }
}