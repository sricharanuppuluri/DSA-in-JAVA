class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> index=new HashMap<>();
        int left=0;
        int res=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);

            if(index.containsKey(c)){
                left=Math.max(left,index.get(c)+1);
            }

            index.put(c,right);
            res=Math.max(res,right-left+1);
        }
        return res;
    }
}