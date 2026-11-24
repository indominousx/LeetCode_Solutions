class Solution {
    public int[] asteroidCollision(int[] ass) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<ass.length;i++){
            if(ass[i]>0) st.push(ass[i]);
            while(!st.isEmpty() && st.peek()>0 && st.peek()<-(ass[i])){
                  st.pop();
            }
            if(st.isEmpty() || st.peek()<0) st.push(ass[i]);
            if(st.peek()==-ass[i]) st.pop();
        }
        int[] res=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
        res[i]=st.pop();
        }
        return res;
    }
}