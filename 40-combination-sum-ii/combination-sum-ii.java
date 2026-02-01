class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        findcombination(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    static void findcombination(int ind,int target,int[] arr,List<List<Integer>> ans,ArrayList<Integer> ds){
       if(target==0){
        ans.add(new ArrayList<>(ds));
        return;
       }
       for(int i=ind;i<arr.length;i++){
       if(i>ind&&arr[i]==arr[i-1]  )continue;
       if(arr[i]>target)break;

           ds.add(arr[i]);
           findcombination(i+1,target-arr[i],arr,ans,ds);
           ds.remove(ds.size()-1);
       }
         
    }
}