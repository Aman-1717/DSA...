class pair{
    int row; int col; int tm;
    public pair(int row,int col,int tm){
        this.row=row; this.col=col; this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length; int m=grid[0].length;
        Queue<pair> q= new LinkedList<>();
        int fresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i,j,0));}
                else if(grid[i][j]==1){fresh++;}
            }
        }
        int time=0;
        int[] dr={-1,1,0,0}; int[] dc={0,0,-1,1};
        while(!q.isEmpty()){
            pair cur=q.poll();
            int r=cur.row; int c=cur.col; int t=cur.tm;
            time=Math.max(time,t);
            for(int d=0;d<4;d++){
                int nr=r+dr[d]; int nc=c+dc[d];
                if(nr>=0&& nc>=0&& nr<n&& nc<m&& grid[nr][nc]==1){
                    grid[nr][nc]=2; fresh--;
                    q.add(new pair(nr,nc,t+1));
                }
            }
        }    
        return fresh==0?time:-1;
    }
}