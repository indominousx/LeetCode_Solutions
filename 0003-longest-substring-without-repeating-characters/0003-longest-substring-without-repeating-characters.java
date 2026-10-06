class Solution {
    public int lengthOfLongestSubstring(String s) {
    //   int l=0;
    //   int r=0;
    //   int maxlen=0;
    //   HashSet<Character> hs = new HashSet<>();
    //   while(r<s.length()){
    //    while(hs.contains(s.charAt(r))){
    //        hs.remove(s.charAt(l));
    //        l+=1;
    //    } 
    //    hs.add(s.charAt(r));
    //    maxlen=Math.max(r-l+1,maxlen); 
    //    r+=1;
    //   }
    //   return maxlen;
   int ml=0;
   int l=0;
   HashSet<Character> hs = new HashSet<>();
   for(int i=0;i<s.length();i++){
    while(hs.contains(s.charAt(i))){
       hs.remove(s.charAt(l));
       l+=1;
    }
   hs.add(s.charAt(i));
   ml=Math.max(ml,i-l+1);
   }
   return ml;
    }
}