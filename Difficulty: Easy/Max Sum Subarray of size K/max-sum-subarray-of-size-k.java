class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int left=0;
        int right=k-1;
        int sum=0;
        int res=0;
        int n=arr.length;
        for(int i=left;i<=right;i++){
            sum=sum+arr[i];   
        }
        while(right<n){
            res=Math.max(sum,res);
            left++;
            right++;
            if(right==n){
                break;
            }
            sum=sum-arr[left-1];
            sum=sum+arr[right];
        }
        return res;
    }
}