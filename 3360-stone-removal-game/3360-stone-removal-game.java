class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int cnt=0;
        int start=10;
        boolean pause=true;
        while(pause){
            n=n-start;
            start=start-1;
            if(n-start<0){
                break;
            }
            cnt+=1;
        }
        if(cnt%2==0) return true;
        return false;
    }
}