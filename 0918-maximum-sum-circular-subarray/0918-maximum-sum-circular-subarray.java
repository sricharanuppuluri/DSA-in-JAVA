class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int minsum=nums[0];
        int maxsum=nums[0];
        int curmin=nums[0];
        int curmax=nums[0];
        for(int num:nums){
            totalsum+=num;
        }
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            curmin=Math.min(x,curmin+x);
            minsum=Math.min(curmin,minsum);
            curmax=Math.max(x,curmax+x);
            maxsum=Math.max(curmax,maxsum);
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum-minsum);
    }
}