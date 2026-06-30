class Solution {
    public int numOfStrings(String[] p, String w) {
       int cnt=0;
       for(String s : p){
        if(w.contains(s)) cnt+=1;
       }
       return cnt;
    //    now we will write in Normal Form.
    
    // int cnt=0;
    // for(int i=0;i<p.length();i++){
    //    String str = p[i];

    // }
     

    //  return cnt;
    }
}