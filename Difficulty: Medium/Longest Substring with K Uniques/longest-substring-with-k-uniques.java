import java.util.*;
class Solution {
    public int longestKSubstr(String s, int k) {
        int n=s.length();
        int left=0;
        int res=-1;
        Map<Character,Integer> freq = new HashMap<>();

        for(int right=0;right<n;right++){
            char c=s.charAt(right);
            freq.put(c,freq.getOrDefault(c,0)+1);

            while(freq.size()>k){
                char leftele=s.charAt(left);
                freq.put(leftele,freq.get(leftele)-1);
                if(freq.get(leftele)==0){
                    freq.remove(leftele);
                }
                left++;
            }

            if(freq.size()==k){
                res=Math.max(res,right-left+1);
            }
        }
        return res;
    }
}