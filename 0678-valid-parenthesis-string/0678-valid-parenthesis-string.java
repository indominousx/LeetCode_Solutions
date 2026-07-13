class Solution {
    public boolean checkValidString(String s) {
       // two ways to solve this problem 
       // Dynamic and Recursive Approach
       // Using cnt method i.e the range method
       int min=0;
       int max=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            min=min+1;
            max=max+1;
        }
        else if(s.charAt(i)==')'){
            min=min-1;
            max=max-1;
        }
        else {
            min=min-1;
            max=max+1;
        }
        if(min<0) min=0;
        if(max<0) return false;
       }
       return (min==0);
    }
}