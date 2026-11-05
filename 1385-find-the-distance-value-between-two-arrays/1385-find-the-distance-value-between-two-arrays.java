class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
           int find_index=findjustlarger(arr2,arr1[i]-d);
           if(find_index==arr2.length|| arr2[find_index]>arr1[i]+d) cnt+=1;
        }
        return cnt;

    }
    public int findjustlarger(int[] arr2 , int target){
       int l=0;
       int r=arr2.length;
       while(l<r){
        int mid=l+(r-l)/2;
        if(arr2[mid]>=target){
            r=mid;
        }
        else{
            l=mid+1;
        }
       }
        return l;
    }
   
}