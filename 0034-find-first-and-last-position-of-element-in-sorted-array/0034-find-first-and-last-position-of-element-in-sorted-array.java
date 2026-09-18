class Solution {
    public int firstoccurence(int[] nums,int n , int k){
        int first=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==k){
                first=mid;
                r=mid-1;
            }
            else if(nums[mid]>k) r=mid-1;
            else l=mid+1;
        }

        return first;
    }

public int lastoccurence(int[] nums,int n , int k){
        int last=-1;
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==k){
                last=mid;
                l=mid+1;
            }
            else if(nums[mid]>k) r=mid-1;
            else l=mid+1;
        }

        return last;
    }

    public int[] searchRange(int[] nums, int target) {
       int first=firstoccurence(nums,nums.length-1,target);
       if(first==-1) return new int[]{-1,-1};
       int last=lastoccurence(nums,nums.length-1,target);
       return new int[]{first,last};
       
        // boolean found=false;
        // int l=0;
        // int r=nums.length-1;
        // while(l<=r){
        //     int mid=l+(r-l)/2;
        //     if(nums[mid]>target){
        //         r=mid-1;
        //     }
        //     else if(nums[mid]<target){
        //         l=mid+1;
        //     }
        //     else{
        //        int start = mid;
        //        int end = mid;
        //        while (start > 0 && nums[start - 1] == target) {
        //             start--;
        //              }
        //        while (end < nums.length - 1 && nums[end + 1] == target) {
        //              end++;
        //              }
    
        //            return new int[]{start, end};
        //     }
        // }
        // return new int[]{-1,-1};
    }
}