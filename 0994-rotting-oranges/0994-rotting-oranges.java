class Solution {
    public int orangesRotting(int[][] g) {
        int m=g.length;
        int n=g[0].length;
        int total=0;
        int count=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j]!=0) total+=1;
                if(g[i][j]==2) q.add(new int[]{i,j});
            }
        }
        int[] dx={0,0,-1,1};
        int[] dy={-1,1,0,0};
        int min=0;
        while(!q.isEmpty()){
            int s=q.size();
            count+=s;
            for(int i=0;i<s;i++){
                int[] pos = q.poll();
                int x=pos[0];
                int y=pos[1];
                for(int d=0;d<4;d++){
                    int nx=x+dx[d];
                    int ny=y+dy[d];
                    if(nx<0 || ny<0 || nx>=m || ny>=n || g[nx][ny]!=1){
                        continue;
                    }
                    g[nx][ny]=2;
                    q.add(new int[]{nx,ny});
                }
            }
            if(!q.isEmpty()) min+=1;
        }
        if(total==count) return min;
        return -1;

    }
}