class Solution {
    public int iswithindays(int[] nums , int we){
     int weight=0;
     int days=1;
     for(int i=0;i<nums.length;i++){
        if(nums[i]+weight>we){
            weight=nums[i];
            days+=1;
        }
        else{
         weight+=nums[i];
        }
     }
     return days;
    }

    public int shipWithinDays(int[] nums, int days) {
        int max=0;
        int capacity=1;
        for(int i=0;i<nums.length;i++){
            max+=nums[i];
            capacity=Math.max(capacity,nums[i]);
        }
        // System.out.println(max);
        // System.out.println(min);
        int l=capacity; int r=max;
        while(l<r){
         int mid=l+(r-l)/2;
         if(iswithindays(nums,mid)<=days){
           r=mid;
         }
         else l=mid+1;
        }
        return l;
    }
}