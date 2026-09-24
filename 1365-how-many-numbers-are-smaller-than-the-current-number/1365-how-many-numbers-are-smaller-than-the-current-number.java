class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] res=new int[101];
        for(int num:nums){
            res[num]++;
        }
        for(int i=1;i<101;i++){
            res[i]+=res[i-1];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans[i]=0;
            }else{
                ans[i]=res[nums[i]-1];
            }
        }
        return ans;
    }
}