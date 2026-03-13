class Solution {
    public boolean isPalindrome(String s) {
        String str1=s.toLowerCase();
       StringBuilder str=new StringBuilder();
       /*char[] check=new char[26];
       for(int i=0;i<26;i++){
        check[i]=(char)(i+'a');
       }*/
       for(char ch:str1.toCharArray()){
        if(Character.isLetterOrDigit(ch))str.append(ch);
       }
       if(str.toString().equals(str.reverse().toString())){
        return true;
       }
       return false;
    }
}