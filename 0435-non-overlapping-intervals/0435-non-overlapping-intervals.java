class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        // Sort them on the basis of their Ending times
        Arrays.sort(in,(a,b) -> Integer.compare(a[1],b[1]));
        int n = in.length;
        int cnt=1;// we can do first meeting for sure
        int lastEndtime=in[0][1];
        for(int i=1;i<n;i++){
            if(in[i][0]>=lastEndtime){
                cnt+=1;
                lastEndtime=in[i][1];
            }
        }
        return n-cnt;
    }
}