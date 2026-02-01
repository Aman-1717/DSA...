class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        findsum(0,nums,ans,new ArrayList<>());
        return ans;}

    static void findsum(int ind,int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        findsum(ind+1,nums,ans,ds);
        ds.remove(ds.size()-1);

        findsum(ind+1,nums,ans,ds);
    }

}