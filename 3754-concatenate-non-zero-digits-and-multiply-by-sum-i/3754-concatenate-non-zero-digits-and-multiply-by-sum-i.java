class Solution {
    public long sumAndMultiply(int n) {
        String num = n + "";
        long prod=0;
        long sum=0;
        int i=0;
        while(i<num.length()){
            if((num.charAt(i)-'0')!=0){
                prod=prod*10+(num.charAt(i)-'0');
                sum+=num.charAt(i)-'0';
            }
            i+=1;
        }
       return prod*sum;
        
    }
}