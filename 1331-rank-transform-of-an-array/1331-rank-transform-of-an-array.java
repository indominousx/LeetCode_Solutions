class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int[] copy = arr.clone();
       Arrays.sort(copy);
       HashMap<Integer,Integer> hs = new HashMap<>();
       int rank=1;
       for(int i=0;i<arr.length;i++){
        if(!hs.containsKey(copy[i])){
            hs.put(copy[i],rank++);
        }
       }
       for(int i=0;i<arr.length;i++){
        arr[i]=hs.get(arr[i]);
       }
       return arr;
     }
}