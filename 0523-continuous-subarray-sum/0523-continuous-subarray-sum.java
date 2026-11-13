class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
     

     // Calculate prefix sum 
     // Look at the remainder after prefixsum % k 
     // Store the index and length
      HashMap<Integer,Integer> hs = new HashMap<>();
      int prefixsum=0;
    
      hs.put(0,-1);
      for(int i=0;i<nums.length;i++){
        prefixsum+=nums[i];
        int rem=prefixsum%k;
        if(hs.containsKey(rem)){
           int index=hs.get(rem);
           if(i-index>=2) return true;
        }
        else{
            hs.put(rem,i);
        }
      }
     return false;
        // O(n^2) Space and Time Complexity both
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     ArrayList<Integer> curr = new ArrayList<>();
        //     int currsum=0;
        //     for(int j=i;j<nums.length;j++){
        //         currsum+=nums[j];
        //         if(j-i+1>=2){
        //             curr.add(currsum);
        //             if(k!=0 && currsum%k==0) return true;
        //             else if(k==0 && currsum==0) return true;
        //         }
        //     }
        //     arr.add(curr);
        // }
        // return false;
    }

}