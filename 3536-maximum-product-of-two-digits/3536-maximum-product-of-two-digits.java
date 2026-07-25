class Solution {
    public int maxProduct(int n) {
        String s = n + "";
        // if(s.length()==2) return (s.charAt(0)-'0')*(s.charAt(1)-'0');
        // char[] arr = s.toCharArray();
        // Arrays.sort(arr);
        // return (arr[arr.length-1]-'0') * (arr[arr.length-2]-'0') ;
        int max1=0;
        int max2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0' > max1){
                max2=max1;
                max1=s.charAt(i)-'0';
                
            }
            else if(s.charAt(i)-'0' > max2){
                max2=s.charAt(i)-'0';
            }
        }
        return max1*max2;
    }
}