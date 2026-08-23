class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                pos.add(nums[i]*nums[i]);
            }else{
                neg.add(nums[i]*nums[i]);
            }
        }
        Collections.reverse(neg);
        int left=0;
        int right=0;
        int n=pos.size();
        int m=neg.size();
        int id=0;
        int[] res=new int[n+m];
        while(left<n && right<m){
            if(pos.get(left)<neg.get(right)){
                res[id]=pos.get(left);
                left++;
                id++;
            }else{
                res[id]=neg.get(right);
                right++;
                id++;
            }
        }
        while(left<n){
            res[id]=pos.get(left);
            left++;
            id++;
        }
        while(right<m){
            res[id]=neg.get(right);
            right++;
            id++;
        }
        return res;
    }
}