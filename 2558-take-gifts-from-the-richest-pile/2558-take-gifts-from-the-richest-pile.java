class Solution {
    public long pickGifts(int[] g, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        // List<long> arr = new ArrayList<>();
        for(int i : g){
            pq.add((long)i);
        }
        for(int i=0;i<k;i++){
            long remain = (long) Math.sqrt(pq.poll());
            pq.add(remain);
        }
        long tSum=0;
        while(!pq.isEmpty()){
            tSum+=pq.poll();
        }
        return tSum;
    }
}