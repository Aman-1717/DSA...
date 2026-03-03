class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
     StringBuffer ans=new StringBuffer();
     String first=strs[0];String second=strs[strs.length-1];
     for(int i=0;i<Math.min(first.length(),second.length());i++){
        if(first.charAt(i)!=second.charAt(i))return ans.toString();
        ans.append(first.charAt(i));
     }
     return ans.toString();
    }
}