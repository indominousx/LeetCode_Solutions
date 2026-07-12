class Solution {
    public boolean canJump(int[] nums) {
        // Take maxIndex which will help you to check if you can actually pass the end. 
        // At every index update maxIndex to where can it jump 
        // If maxIndex >=length of nums
        // U can definitely reach the end
        int maxIndex=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxIndex) return false;
            maxIndex=Math.max(maxIndex,i+nums[i]);
            if(maxIndex>=nums.length) return true;
        }
        return true;
    }
}