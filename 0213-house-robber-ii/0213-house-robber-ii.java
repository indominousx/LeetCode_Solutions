class Solution {
    public int rob(int[] nums) {
       //-------------------Tabulation-------------------
           if(nums.length==1) return nums[0];
           // for 0 to n-2
           int max1=tabulation(nums,0,nums.length-2);
           // for 1 to n-1
           int max2=tabulation(nums,1,nums.length-1);
           return Math.max(max1,max2);


       

        // //---------------Memoization-----------------
        // if(nums.length==1) return nums[0];

        // // for 0 to n-2
        // int[] dp_1 = new int[nums.length];
        // Arrays.fill(dp_1,-1);
        // int max1=memoization(nums,nums.length-2,0,dp_1);
        // // for 1 to n-1 
        // int[] dp_2 = new int[nums.length];
        // Arrays.fill(dp_2,-1);
        // int max2=memoization(nums,nums.length-1,1,dp_2);

        // return Math.max(max1,max2);




        //----------RECURSIVE----------------------
        // if(nums.length==1) return nums[0];
        //  // Starting from 0 to n-2 
        //   int max1=recursive(nums,nums.length-2,0);
        //  // Starting from 1 to n-1
        //   int max2=recursive(nums,nums.length-1,1);
        //   return Math.max(max1,max2);
    }
     public int tabulation(int[] nums , int start , int end){
        if(start==end) return nums[start];
        int[] dp = new int[nums.length];
        dp[start]=nums[start];
        dp[start+1]=Math.max(nums[start],nums[start+1]);
        for(int i=start+2;i<=end;i++){
           dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[end];
     }




    public int recursive(int[] nums,int starting_point , int ending_point){
       if(starting_point<ending_point) return 0;
       return Math.max(recursive(nums,starting_point-2,ending_point)+nums[starting_point],recursive(nums,starting_point-1,ending_point));
    }

    public int memoization(int[] nums, int starting_point , int ending_point , int[] dp){
       if(starting_point<ending_point) return 0;
       if(dp[starting_point]!=-1) return dp[starting_point];
       int res = Math.max(memoization(nums,starting_point-2,ending_point,dp)+nums[starting_point],memoization(nums,starting_point-1,ending_point,dp));
       return dp[starting_point]=res;
    }

}
