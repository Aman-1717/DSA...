class Solution {
    public boolean rotateString(String s, String goal) {
        char[] arr=goal.toCharArray();
     if(s.length()!=goal.length())return false;
     for(int i=0;i<s.length();i++){
        char temp=arr[s.length()-1];
        for(int j=arr.length-1;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[0]=temp;
        if(s.equals(new String(arr)))return true;
     }
     return false;
    }
}
