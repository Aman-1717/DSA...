class Solution {
    public boolean canFinish(int v, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){adj.add(new ArrayList<>());}
        for(int i=0;i<prerequisites.length;i++){adj.get(prerequisites[i][0]).add(prerequisites[i][1]);}
        int[] indegree=new int[v];
        for(int i=0;i<v;i++){
            for(int neigh:adj.get(i)){indegree[neigh]++;}
        }
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0){q.add(i);}
        }
        List<Integer> topo=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            topo.add(node);
            for(int neigh:adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh]==0)q.add(neigh);
            }
        }
        if(topo.size()==v)return true;
        return false;
    }
}