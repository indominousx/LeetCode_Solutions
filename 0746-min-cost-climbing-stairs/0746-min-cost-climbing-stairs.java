class Solution {
    public int minCostClimbingStairs(int[] cost) {
       int[] costdp = new int[cost.length];
       costdp[0]=cost[0];
       costdp[1]=cost[1];
       for(int i=2;i<cost.length;i++){
          costdp[i]=cost[i]+Math.min(costdp[i-1],costdp[i-2]);
       }
       return Math.min(costdp[cost.length-1],costdp[cost.length-2]);
    }
}