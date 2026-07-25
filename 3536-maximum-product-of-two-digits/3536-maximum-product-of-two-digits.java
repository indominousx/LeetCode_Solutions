class Solution {
    public int maxProduct(int n) {
        String s = n + "";
        if(s.length()==2) return (s.charAt(0)-'0')*(s.charAt(1)-'0');
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return (arr[arr.length-1]-'0') * (arr[arr.length-2]-'0') ;
    }
}