class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']+=1;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pq.add(freq[i]);
            }
        }
        int time=0;
        while(!pq.isEmpty()){
            int tcy=0;
            int cycles=n+1;
            ArrayList<Integer> arr = new ArrayList<>();
            while(cycles>0 && !pq.isEmpty()){
                int currtask=pq.poll();
                if(currtask>1){
                    arr.add(currtask-1);
                }
                tcy+=1;
                cycles-=1;
            }
            for(int ele:arr){
                pq.add(ele);
            }
            time+=pq.isEmpty() ? tcy : n+1;
        }
        return time;

    }
}