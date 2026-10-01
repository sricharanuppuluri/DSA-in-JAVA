class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int maxlen=0;
        int right,left=0;
        for(right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            if(count>k){
                if(nums[left]==0){
                    count--;
                }
                left++;
            }
        }
        return  nums.length-left;
    }
}