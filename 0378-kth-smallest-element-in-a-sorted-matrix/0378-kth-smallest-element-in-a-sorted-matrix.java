class Solution {
    public int kthSmallest(int[][] nums, int k) {
    //   int n=nums.length;
    //   int l=0;
    //   int r=nums.length*nums.length-1;
    //   while(l<=r){
    //     int mid=l+(r-l)/2;
    //     if(mid==k-1) return nums[mid/n][mid%n];
    //     else if(mid>k-1) r=mid-1;
    //     else l=mid+1;
    //   }
    //   return nums[0][0];
    // Above Approach won't work

    // use Heap to solve
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<nums.length;i++){
        for(int j=0;j<nums.length;j++){
            pq.add(nums[i][j]);
            if(pq.size()>k) pq.poll();
        }
    }
   return pq.peek();
    }
}