class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int prefixsum=0;
        for(int i=0;i<n;i++){
            prefixsum+=nums[i];
            int rem=prefixsum%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2){
                    return true;
                }
            }else{
                map.put(rem,i);
            }
        }
        return false;
    }
}