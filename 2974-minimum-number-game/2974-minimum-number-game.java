class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int i=0;
        while(!pq.isEmpty()){
           int temp = pq.poll();
           arr[i]=pq.poll();
           arr[i+1]=temp;
           i+=2;
        }
        return arr;
    }
}