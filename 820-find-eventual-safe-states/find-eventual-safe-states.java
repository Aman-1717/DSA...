class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int v=graph.length;
        for(int i=0;i<v;i++){adj.add(new ArrayList<>());}
        for(int i=0;i<v;i++){
            for(int j=0;j<graph[i].length;j++){
              adj.get(i).add(graph[i][j]);
            }
        }
        List<Integer> ans=new ArrayList<>();
        int[] vis=new int[v];
        int[] pathvis=new int[v];
        int[] check=new int[v];
        for(int i=0;i<v;i++){
            if(vis[i]==0){
               dfscheck(i,vis,pathvis,adj,check);
               }
            }
        for(int i=0;i<v;i++){
            if(check[i]==1) ans.add(i);
        }
        return ans;
    }
    boolean dfscheck(int node,int[] vis,int[] pathvis,ArrayList<ArrayList<Integer>> adj,int[] check){
        vis[node]=1;pathvis[node]=1;check[node]=0;
        for(int neigh:adj.get(node)){
            if(vis[neigh]==0){
                if(dfscheck(neigh,vis,pathvis,adj,check)==true)return true;
            }
            else if(pathvis[neigh]==1)return true;

        }
        check[node]=1;
        pathvis[node]=0;
        return false;
    }
}