class Solution {
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        int[][] vis= new int[r][c];
        int[] delcol={0,1,0,-1};
        int[] delrow={-1,0,1,0};
        for(int i=0;i<c;i++){
            if(vis[0][i]==0 && board[0][i]=='O'){
                dfs(0,i,vis,board,delcol,delrow);
            }
            if(vis[r-1][i]==0 && board[r-1][i]=='O'){
                dfs(r-1,i,vis,board,delcol,delrow);
            }
        }
        for(int j=0;j<r;j++){
            if(vis[j][0]==0 && board[j][0]=='O'){
                dfs(j,0,vis,board,delcol,delrow);
            }
            if(vis[j][c-1]==0 && board[j][c-1]=='O'){
                dfs(j,c-1,vis,board,delcol,delrow);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(vis[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

    }
    static void dfs(int row,int col,int[][] vis,char[][] board,int[] delcol,int[] delrow){
        vis[row][col]=1;
        int r=board.length; int c=board[0].length;
        for(int i=0;i<4;i++){
            int nrow=row+delrow[i];
            int ncol=col+delcol[i];
            if(nrow>=0 && nrow<r && ncol>=0 && ncol<c && vis[nrow][ncol]==0
             && board[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,board,delcol,delrow);
             }
        }
    }
}