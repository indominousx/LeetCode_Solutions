class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //    Arrays.sort(nums);
        int cnt=0;
        int lessthantarget=0;
           ArrayList<Integer> arr = new ArrayList<>();
           for(int i=0;i<nums.length;i++){
            if(nums[i]==target) cnt+=1;
            else if(nums[i]<target) lessthantarget+=1;
           }
           for(int i=0;i<cnt;i++){
            arr.add(lessthantarget+i);
           }
           return arr;
    }
}