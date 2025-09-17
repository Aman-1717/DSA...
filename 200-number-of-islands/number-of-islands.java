class Solution {
    public int numIslands(char[][] grid) {
     int n=grid.length;
     int m=grid[0].length;
     boolean[][] visited=new boolean[n][m];
     int[] newx={1,0,-1,0};
     int[] newy={0,1,0,-1};
     int islandcount=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(grid,visited,i,j,newx,newy);
                    islandcount++;}
            }
    }
    return islandcount;}
     public void dfs(char[][] grid,boolean[][] visited,int x,int y,int[] newx,int[] newy){
      visited[x][y]=true;
      for(int v=0;v<4;v++){
        int l=x+newx[v];
        int r=y+newy[v];
        if(l>-1 && l<grid.length && r>-1 && r<grid[0].length && grid[l][r]=='1' && !visited[l][r]){
            dfs(grid,visited,l,r,newx,newy);
        }
      } 
    }
    
}