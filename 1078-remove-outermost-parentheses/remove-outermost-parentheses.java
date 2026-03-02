class Solution {
    public String removeOuterParentheses(String s) {
       int level=0;
       StringBuffer res=new StringBuffer();
       for(char ch:s.toCharArray()){
        if(ch=='('){
            if(level>0)res.append(ch);
            level++;
        }
        else if(ch==')'){
            level--;
            if(level>0)res.append(ch);
        }
       } return res.toString();
       
    }
}