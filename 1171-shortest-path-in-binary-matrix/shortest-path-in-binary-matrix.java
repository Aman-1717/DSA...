class triplet{int first;int second; int third;
public triplet(int f,int s,int th){first=f;second=s;third=th;}
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length; int m=grid[0].length;
        int[] src={0,0}; int[] dest={n-1,m-1};
        if(grid[0][0]==1 || grid[n-1][m-1]==1)return -1;
        if(src[0]==dest[0]&& src[1]==dest[1])return 1;
        Queue<triplet> q=new LinkedList<>();
        int[][] dist=new int[n][m];
        for(int i=0;i<n;i++){Arrays.fill(dist[i],Integer.MAX_VALUE);}
        dist[src[0]][src[1]]=1; q.add(new triplet(1,src[0],src[1]));
        int dr[]={-1,-1,0,1,1,1,0,-1}; int dc[]={0,1,1,1,0,-1,-1,-1};
        while(!q.isEmpty()){ int dis=q.peek().first; int r=q.peek().second; int c=q.peek().third;q.remove();
        for(int i=0;i<8;i++){
            int nrow=r+dr[i]; int ncol=c+dc[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m&& grid[nrow][ncol]==0&&
                  dis+1<dist[nrow][ncol]){
                    dist[nrow][ncol]=dis+1;
                    if(nrow==dest[0]&& ncol==dest[1]) return dis+1;
                    q.add(new triplet(1+dis,nrow,ncol));
                  }
        }
    }return -1;
}
}