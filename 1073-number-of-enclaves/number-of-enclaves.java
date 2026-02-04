class Solution {
    public int numEnclaves(int[][] grid) {
       int n=grid.length;
       int m=grid[0].length;
       int[] delrow={-1,0,1,0};
       int[] delcol={0,1,0,-1};
       int[][] vis=new int[n][m];
       for(int i=0;i<m;i++){
        if(vis[0][i]==0 && grid[0][i]==1){
            dfs(0,i,vis,grid,delrow,delcol);
        }
        if(vis[n-1][i]==0 && grid[n-1][i]==1){
            dfs(n-1,i,vis,grid,delrow,delcol);
        }
       }
       for(int j=0;j<n;j++){
        if(vis[j][0]==0 && grid[j][0]==1){
            dfs(j,0,vis,grid,delrow,delcol);
        }
        if(vis[j][m-1]==0 && grid[j][m-1]==1){
            dfs(j,m-1,vis,grid,delrow,delcol);
        }
       }
       int count=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(vis[i][j]==0 && grid[i][j]==1){
                count++;
            }
        }
       }
       return count;
    }
    static void dfs(int row,int col,int[][] vis,int[][] board,int[] delrow,int[] delcol){
        vis[row][col]=1;
        int r=board.length; int c=board[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<r && ncol>=0 && ncol<c && vis[nrow][ncol]==0
             && board[nrow][ncol]==1){
                dfs(nrow,ncol,vis,board,delcol,delrow);
}}}
}