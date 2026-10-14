class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        int adjacent=0;
        int before_adjacent=0;
        for(int i=0;i<nums.length;i++){
            int temp=adjacent;
            adjacent=Math.max(before_adjacent+nums[i],adjacent);
            before_adjacent=temp;
        }
        return adjacent;



        // int[] dp = new int[nums.length+1];
         //-------------------------------------
        // if(nums.length==0) return 0;
        // if(nums.length==1) return (nums[0]);
        // int[] dp = new int[nums.length];
        // Arrays.fill(dp,-1);
        // dp[0]=nums[0];
        // dp[1]=Math.max(nums[0],nums[1]);
        // for(int i=2;i<=nums.length-1;i++){
        //   dp[i]=Math.max(dp[i-2]+nums[i] , dp[i-1]);
        //  Tabulation
        // }
        //-----------------------------------------------
        // return dp[nums.length-1];
        // return memo(dp,nums,nums.length-1); // Memoization
        // return robhouse(nums,nums.length-1); Recursive Approach
    }
    // public int robhouse(int[] nums , int i){
    //     if(i<0) return 0;
    //     return Math.max(robhouse(nums,i-2)+nums[i],robhouse(nums,i-1));
    // }
    // Memoization
    public int memo(int[] dp , int[] nums , int i){
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int res=Math.max(memo(dp,nums,i-2)+nums[i] , memo(dp,nums,i-1));
        dp[i]=res;
        return res;
    }
}