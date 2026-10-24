class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        int res=memoization(coins,amount,dp);
        if(res==Integer.MAX_VALUE) return -1;
        return res;
        
        // int res= recursive(coins,amount);
        // if(res==Integer.MAX_VALUE) return -1;
        // return res;
    }
    public int memoization(int[] coins, int amount , int[] dp){
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;
        if(dp[amount]!=-1) return dp[amount];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int steps=memoization(coins,amount-coins[i],dp);
            if(steps!=Integer.MAX_VALUE){
               min=Math.min(min,steps+1);
            }          
        }
        dp[amount]=min;
         return min;
    }
       
    
    
    public int recursive(int[] coins, int amount){
        if(amount==0) return 0;
        if(amount<0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int steps=recursive(coins,amount-coins[i]);
            if(steps!=Integer.MAX_VALUE){
                min=Math.min(min,steps+1);
            }
        }
        return min;
    }
}