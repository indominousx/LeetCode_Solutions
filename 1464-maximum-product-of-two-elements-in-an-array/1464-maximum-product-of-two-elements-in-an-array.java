class Solution {
    public int maxProduct(int[] nums) {
        // keep two tracking 
        // max 
        // second max
        // If max is found then change second max to max

        // Another Method. Use Max Heap 
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for(int i=0;i<nums.length;i++){
        //     pq.add(nums[i]);
        // }
        // return ((pq.poll()-1)*(pq.poll()-1));
        int fmax=1;
        int smax=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=fmax){
                smax=fmax;
                fmax=nums[i];
            }
            else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        return (fmax-1)*(smax-1);
    }
}