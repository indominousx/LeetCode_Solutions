class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int maxlen=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            while(hs.get(nums[i])>k){
                hs.put(nums[l],hs.get(nums[l])-1);
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}