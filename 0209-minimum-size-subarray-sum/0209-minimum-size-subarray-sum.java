class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        while(right<n){
            sum=sum+nums[right];
            while(sum>=target){
                int len=right-left+1;
                res =Math.min(len,res);
                sum=sum-nums[left];
                left++;
            }
            right++;
        }
        return res==Integer.MAX_VALUE? 0: res;
    }
}