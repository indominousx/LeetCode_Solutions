class Solution {
    public String mapWordWeights(String[] w, int[] we) {
        String s = "";
        for(int i=0;i<w.length;i++){
            int sum =0;
            int l=0;
            while(l<w[i].length()){
                sum+=we[w[i].charAt(l)-'a'];
                l+=1;
            }
           char mchar = (char)('z' - (sum)%26);
           s+=mchar;
        }
        return s;
    }
}