class Solution {
    public String reverseWords(String s) {
      String[] token=s.trim().split("\\s+") ;
      StringBuffer str=new StringBuffer();
      for(int i=token.length-1;i>=0;i--){
        str.append(token[i]);
        if(i!=0)str.append(" ");
      } 
      return str.toString();
    }
}