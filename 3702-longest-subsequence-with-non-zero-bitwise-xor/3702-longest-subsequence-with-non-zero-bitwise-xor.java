class Solution {
    public int longestSubsequence(int[] nums) {
        // int len=0;
        // int xor=0;
        // int l=0;
        // for(int i=1;i<nums.length;i++){
        //     xor=nums[i]^nums[l];
        //     while(xor==0){
        //         l++;
        //         xor=nums[l]^xor;
        //     }
        //     len=Math.max(len,i-l+1);
        // }
        // return len;
        // Wrong approach above
        int xor=0;
        boolean nonzero=false;
        for(int num:nums){
            xor=xor^num;
            if(num!=0) nonzero=true;
        }
        if(nonzero==false) return 0;
        else if(xor!=0) return nums.length;
        else{
            return nums.length-1;
        }
    }
}