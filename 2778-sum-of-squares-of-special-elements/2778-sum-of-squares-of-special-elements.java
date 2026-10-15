class Solution {
    public int sumOfSquares(int[] nums) {
     int res=0;
     for(int i=0;i<nums.length;i++){
        if(nums.length%(i+1)!=0) continue;
        else {
            res+=nums[i]*nums[i];
            // System.out.println(res);
        }
     }   
     return res;
    }
}