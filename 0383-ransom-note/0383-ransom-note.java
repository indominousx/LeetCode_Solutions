class Solution {
    public boolean canConstruct(String r, String m) {
        int pointer=0;
        HashMap<Integer,Integer> hs= new HashMap<>();
        for(int i=0;i<m.length();i++){
           hs.put(m.charAt(i)-'a',hs.getOrDefault(m.charAt(i)-'a',0)+1);
        }
        for(int i=0;i<r.length();i++){
            if(!hs.containsKey(r.charAt(i)-'a') || hs.get(r.charAt(i)-'a')<=0){
                return false;
            }
            hs.put(r.charAt(i)-'a',hs.get(r.charAt(i)-'a')-1);
        }
        return true;
    }
}