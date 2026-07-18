class Solution {
    public int gcd(int num1 , int num2){
        if(num2==0) return num1;
        else{
            return gcd(num2,num1%num2);
        }
    }
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
        }
        System.out.println(min);
        System.out.println(max);
        return gcd(min,max);
       
    }
}