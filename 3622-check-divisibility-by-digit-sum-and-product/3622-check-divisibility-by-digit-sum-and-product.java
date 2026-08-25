class Solution {
    public boolean checkDivisibility(int n) {
        String str = n +"";
        int sum=0;
        int mul=1;
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-'0';
            mul=mul*(str.charAt(i)-'0');
        }
        // System.out.println(sum);
        // System.out.println(mul);
        int rem = n%(sum+mul);
        // System.out.println(rem);
        return rem==0;
    }
}