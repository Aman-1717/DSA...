class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int r=grid1.length; int c=grid1[0].length;
        int[][] vis=new int[r][c];
        int[] delrow={-1,0,1,0};int[] delcol={0,1,0,-1};int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            if(vis[i][j]==0 && grid2[i][j]==1){
                if(dfs(i,j,vis,grid1,grid2,delrow,delcol)==true)count++;
            }}
        }return count;
    }
    boolean dfs(int row,int col,int[][] vis,int[][] grid1,int[][] grid2,int[] delrow,int[] delcol){
        vis[row][col]=1;
        boolean check=true; if(grid1[row][col]==0)check=false;
        for(int i=0;i<4;i++){
            int nrow=delrow[i]+row; int ncol=delcol[i]+col;
            if(nrow>=0&& nrow<grid1.length&& ncol>=0&& ncol<grid1[0].length&&vis[nrow][ncol]==0&&grid2[nrow][ncol]==1){
                if(!dfs(nrow,ncol,vis,grid1,grid2,delrow,delcol))check=false;
            }
        }return check;
    }
}