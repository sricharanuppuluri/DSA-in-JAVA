class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0;
        long maxsum=0;
        Map<Integer,Integer> freq=new HashMap<>();
        int left=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            freq.put(nums[right],freq.getOrDefault(nums[right],0)+1);
            if(right-left+1>k){
                sum-=nums[left];
                freq.put(nums[left],freq.get(nums[left])-1);
                if(freq.get(nums[left])==0){
                    freq.remove(nums[left]);
                }
                left++;
            }
            if(right-left+1==k && freq.size()==k){
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
}