class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Boolean> hs = new HashMap<>();
        for(int i=1;i<=nums.length;i++){
         hs.put(i*k,false);
        }
        for(int i=0;i<nums.length;i++){
            if(hs.containsKey(nums[i])){
                hs.replace(nums[i],true);
            }
        }
        for(int i=1;i<=nums.length;i++){
            int key=i*k;
            if(hs.get(key)!=true) return key;
        }
        return (nums.length+1)*k;
    }
}