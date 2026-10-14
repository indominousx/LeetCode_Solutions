class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return memo(dp,nums,nums.length-1);
        // return robhouse(nums,nums.length-1); Recursive Approach
    }
    // public int robhouse(int[] nums , int i){
    //     if(i<0) return 0;
    //     return Math.max(robhouse(nums,i-2)+nums[i],robhouse(nums,i-1));
    // }
    public int memo(int[] dp , int[] nums , int i){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int res=Math.max(memo(dp,nums,i-2)+nums[i] , memo(dp,nums,i-1));
        dp[i]=res;
        return res;
    }
}