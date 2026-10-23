class Solution {
    public int maxProduct(int[] nums) {
        int sufix=1;
        int prefix=1;
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(sufix==0) sufix=1;
            prefix*=nums[i];
            sufix*=nums[n-1-i];
            ans=Math.max(ans,Math.max(prefix,sufix));
        }
        return ans;
    }
}