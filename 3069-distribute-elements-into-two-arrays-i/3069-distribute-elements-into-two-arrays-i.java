class Solution {
    public int[] resultArray(int[] nums) {
     int[] ans = new int[nums.length];
     int l1=0;
     int l2=0;
     ArrayList<Integer> arr1 = new ArrayList<>();
     ArrayList<Integer> arr2 = new ArrayList<>();
     arr1.add(nums[0]);
     arr2.add(nums[1]);
     for(int i=2;i<nums.length;i++){
         if(arr1.get(l1)>arr2.get(l2)){
            arr1.add(nums[i]);
            l1+=1;
         }
         else{
            arr2.add(nums[i]);
            l2+=1;
         }
     }
    int idx=0;
    for(int num:arr1) ans[idx++]=num;
    for(int num:arr2) ans[idx++]=num;
    return ans;
    }
}