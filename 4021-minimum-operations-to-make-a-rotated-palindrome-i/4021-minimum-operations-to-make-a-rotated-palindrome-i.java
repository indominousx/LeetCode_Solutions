class Solution {
    public int minOperations(String s) {
        int cost=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            int rot=i;
            for(int j=0;j<s.length()/2;j++){
                char c1=s.charAt((i+j)%s.length());
                char c2=s.charAt((i+s.length()-1-j)%s.length());

                int cost1=(c1-c2+26)%26;
                int cost2=(c2-c1+26)%26;
                rot+=Math.min(cost1,cost2);
            }
            cost=Math.min(cost,rot);
        }
        return cost;
    }
}