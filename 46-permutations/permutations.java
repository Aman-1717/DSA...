class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        back(nums,used,new ArrayList<>(),ans);
        return ans;
    }
    static void back(int[] nums,boolean[] used, ArrayList<Integer> ds,List<List<Integer>> ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            used[i]=true;
            ds.add(nums[i]);
            back(nums,used,ds,ans);
            ds.remove(ds.size()-1);
            used[i]=false;
        }
    }
}