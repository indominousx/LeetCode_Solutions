class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // if(nums.length==1) return new List<List<Integer>>;
        boolean[] pick = new boolean[nums.length];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        permutation(nums,ans,arr,pick); 
        return ans;         
    }
    public static void permutation(int[] nums , List<List<Integer>>ans, List<Integer> arr ,boolean[] pick){
        if(arr.size()==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!pick[i]){
                arr.add(nums[i]);
                pick[i]=true;
                permutation(nums,ans,arr,pick);
                arr.remove(arr.size()-1);
                pick[i]=false;
            }
        }
    }
}