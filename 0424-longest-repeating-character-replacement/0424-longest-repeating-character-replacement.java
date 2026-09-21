class Solution {
    public int characterReplacement(String s, int k) {
        int[] fre=new int[26];
        int left=0;
        int maxfre=0;
        int maxwindow=0;
        for(int right=0;right<s.length();right++){
            fre[s.charAt(right)-'A']++;
            maxfre=Math.max(maxfre,fre[s.charAt(right)-'A']);
            int windowlength=right-left+1;
            if(windowlength-maxfre>k){
                fre[s.charAt(left)-'A']--;
                left++;
            }
            windowlength=right-left+1;
            maxwindow=Math.max(maxwindow,windowlength);
        }
        return maxwindow;
    }
}