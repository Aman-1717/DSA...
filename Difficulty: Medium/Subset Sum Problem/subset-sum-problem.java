class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        int p1=arr.length-1;
        return subset(arr,n,sum,p1);
        
    }
    static boolean subset(int[] arr,int n,int sum,int p1){
        if(sum==0)return true;
        if(n==0)return false;
        if(arr[p1]>sum){
            return subset(arr,n-1,sum,p1-1);
        }
        else{
            
            return subset(arr,n-1,sum-arr[p1],p1-1)||subset(arr,n-1,sum,p1-1);
        }
    }
}