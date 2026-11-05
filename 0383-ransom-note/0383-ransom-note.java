class Solution {
    public boolean canConstruct(String r, String m) {
        int pointer=0;
        HashMap<Character,Integer> hs= new HashMap<>();
        for(int i=0;i<m.length();i++){
           hs.put(m.charAt(i),hs.getOrDefault(m.charAt(i),0)+1);
        }
        for(int i=0;i<r.length();i++){
            if(!hs.containsKey(r.charAt(i)) || hs.get(r.charAt(i))<=0){
                return false;
            }
            hs.put(r.charAt(i),hs.get(r.charAt(i))-1);
        }
        return true;
    }
}