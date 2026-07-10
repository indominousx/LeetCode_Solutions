class Solution {

   public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void moveZeroes(int[] nums) {
    //    //Brute Approach
    //    ArrayList<Integer> arr = new ArrayList<>();
    //    for(int i=0;i<nums.length;i++){
    //        if(nums[i]!=0) arr.add(nums[i]);
    //    }
    //    for(int i=0;i<arr.size();i++){
    //     nums[i]=arr.get(i);
    //    }
    //    for(int i=arr.size();i<nums.length;i++){
    //     nums[i]=0;
    //    }

    // works but only when first element is zero
    // if(nums.length>1){
    // int l=0;
    // int r=0;
    // for(int i=0;i<nums.length;i++){
    //     if(nums[r]!=0){
    //         nums[l]=nums[r];
    //         nums[r]=0;
    //         l+=1;
    //         r+=1;
    //     }
    //     else r+=1;
    // }
    // }
     
     // Optimal Approach
    //  int l=0;
    //  for(int r=0;r<nums.length;r++){
    //     if(nums[r]!=0){
    //         int temp=nums[r];
    //         nums[r]=nums[l];
    //         nums[l]=temp;
    //         l+=1;
    //     }
    //  }
    //  Second appraoch
//     int j=-1;
//     for(int i=0;i<nums.length;i++){
//         if(nums[i]==0){
//             j=i;
//             break;
//         }
//     }
//     if(j==-1) return;
//    for(int i=j+1;i<nums.length;i++){
//     if(nums[i]!=0){
//         int temp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=temp;
//         j+=1;
//     }
//    }
int l=0;
for(int r=0;r<nums.length;r++){
    if(nums[r]!=0){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
        l+=1;
    }
}

}
}