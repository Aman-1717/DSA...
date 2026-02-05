class Solution {
    public boolean isBipartite(int[][] grid) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            adj.add(new ArrayList<Integer>());}

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                adj.get(i).add(grid[i][j]);
            }
        }  
        int v=grid.length;
        int[] color=new int[grid.length];
        Arrays.fill(color,-1);
        for(int i=0;i<grid.length;i++){
            if(color[i]==-1){
                if(check(i,grid.length,adj,color)==false){
                    return false;
                }
            }
        }
           return true;
    }
    boolean check(int i,int v,ArrayList<ArrayList<Integer>> adj,int[] color){
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        color[i]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int neigh:adj.get(node)){
                if(color[neigh]==-1){
                    color[neigh]=1-color[node];
                    q.add(neigh);
                }
                else if(color[neigh]==color[node]){
                    return false;
                }
            }
        }
        return true;
    }
}