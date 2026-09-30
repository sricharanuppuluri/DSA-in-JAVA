class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0,maxcount=0,j=0;
        while(j<n){
            if(nums[j]==1){
                count++;
            }else{
                maxcount=Math.max(maxcount,count);
                count=0;
            }
            j++;
        }
        return Math.max(maxcount,count);
    }
}