class Solution {
    public int maxProduct(int[] nums) {
        // keep two tracking 
        // max 
        // second max
        // If max is found then change second max to max

        // Another Method. Use Max Heap 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        return ((pq.poll()-1)*(pq.poll()-1));
    }
}