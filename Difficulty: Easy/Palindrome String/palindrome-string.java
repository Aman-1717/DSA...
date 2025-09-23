class Solution {
    boolean isPalindrome(String s) {
      return pal(s,0,s.length());  
        
    }
    boolean pal(String s1,int i,int n){
        if(i>n/2)return true;
        if(s1.charAt(i)!=s1.charAt(n-1))return false;
        return pal(s1,i+1,n-1);
        
    }
}