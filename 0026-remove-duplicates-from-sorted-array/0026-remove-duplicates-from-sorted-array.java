class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int right=1;
        int noOfUniqueEle=1;
        while(right<nums.length){
            if(nums[right]==nums[right-1]){
                right++;
                continue;
            }
            nums[left+1]=nums[right];
            left++;
            right++;
            noOfUniqueEle++;
        }
        return noOfUniqueEle;
    }
}