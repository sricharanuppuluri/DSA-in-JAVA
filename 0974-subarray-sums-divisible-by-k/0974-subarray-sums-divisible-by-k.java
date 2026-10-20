class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int prefixsum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            prefixsum+=num;
            int rem=prefixsum%k;
            if(rem<0) rem=rem+k;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}