class Solution {
    public String removeOuterParentheses(String s) {
        int pos=0;
        // Stack<Character> st = new Stack<>();
        // StringBuilder sb = new StringBuilder("");
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='('){
        //         if(st.size()>0) sb.append(s.charAt(i));
        //         st.push(s.charAt(i));
        //     }
        //     else{
        //         st.pop();
        //         if(st.size()>0) sb.append(s.charAt(i));
        //     }
        // }
        // return sb.toString();

        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(pos>0) sb.append(s.charAt(i));
                pos++;
            }
            else{
                pos--;
                if(pos>0) sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}