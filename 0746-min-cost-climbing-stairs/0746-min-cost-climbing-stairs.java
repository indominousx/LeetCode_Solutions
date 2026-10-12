class Solution {
    public int minCostClimbingStairs(int[] cost) {
    //    int[] costdp = new int[cost.length];
    //    costdp[0]=cost[0];
    //    costdp[1]=cost[1];
    //    for(int i=2;i<cost.length;i++){
    //       costdp[i]=cost[i]+Math.min(costdp[i-1],costdp[i-2]);
    //    }
       int oneS=cost[0];
       int secS=cost[1];
       for(int i=2;i<cost.length;i++){
          cost[i]=cost[i]+Math.min(oneS,secS);
          oneS=secS;
          secS=cost[i];
       }
       return Math.min(oneS,secS);
    }
}