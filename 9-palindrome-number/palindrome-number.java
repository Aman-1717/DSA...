class Solution {
    public boolean isPalindrome(int x) {
       if(x<0){
        return false;
       } 
       else{
        if(x==reverse(x)){
            return true;
        }
        else{
            return false;
        }

       }
    }
    int reverse(int x){
        int rev=0;
        while(x!=0){
            int pop=x%10;
            x=x/10;
            rev=rev*10+pop;
        }
        return rev;
    }
}