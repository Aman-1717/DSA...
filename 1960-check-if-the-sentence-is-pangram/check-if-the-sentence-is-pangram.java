class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] chars=new int[26];
        for(char ch:sentence.toCharArray()){
            int index=ch-'a';
            chars[index]++;
        }
        for(int i:chars){
            if(i==0)return false;
        }return true;
    }
}