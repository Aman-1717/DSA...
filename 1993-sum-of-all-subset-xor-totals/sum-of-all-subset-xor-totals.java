class Solution {
    public int subsetXORSum(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
        back(0,nums,ans,new ArrayList<>());
        int sum=0;
        for(int i=0;i<ans.size();i++){
            int subsum=0;
            for(int j=0;j<ans.get(i).size();j++){
                subsum=subsum^ans.get(i).get(j);
            }
            sum=sum+subsum;
        }
        return sum;
        
    }
   
    static void back(int ind,int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds){
        if(ind==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        back(ind+1,nums,ans,ds);
        ds.remove(ds.size()-1);
        back(ind+1,nums,ans,ds);
    }
}