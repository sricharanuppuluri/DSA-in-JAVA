class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            int s=-nums[i];
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    List<Integer> values=new ArrayList<>();
                    values.add(nums[i]);
                    values.add(nums[left]);
                    values.add(nums[right]);
                    result.add(values);
                    left++;
                    right--;
                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}