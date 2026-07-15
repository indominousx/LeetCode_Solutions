class Solution {
    public int[][] insert(int[][] in, int[] nInt) {
        int i=0;
        int n=in.length;
        List<int[]> arr = new ArrayList<>();     
        while(i<n && in[i][1]<nInt[0]){
          arr.add(in[i]);
          i=i+1;
        }
        while(i<n && in[i][0] <= nInt[1]){
             nInt[0] = Math.min(nInt[0],in[i][0]);
             nInt[1] = Math.max(nInt[1],in[i][1]);
             i=i+1;
        }
        arr.add(nInt);
        while(i<n){
            arr.add(in[i]); 
            i=i+1;
        }
        return arr.toArray(new int[arr.size()][]);
    }
}