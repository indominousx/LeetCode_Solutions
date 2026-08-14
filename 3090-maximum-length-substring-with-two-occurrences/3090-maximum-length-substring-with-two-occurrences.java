class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        int len=0;
        int l=0;
        for(int i=0;i<s.length();i++){
          hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
          while(hs.get(s.charAt(i))>2){
            hs.put(s.charAt(l),hs.get(s.charAt(l))-1);
            l+=1;
          }
          len=Math.max(len,i-l+1);
        }
        return len;
    }
}