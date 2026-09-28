class Solution {
    public String minWindow(String s, String t) {
        int[] mapS=new int[256];
        int[] mapT=new int[256];
        int left=0,right=0,minlen=Integer.MAX_VALUE,minstart=0;
        for(char ch:t.toCharArray()){
            mapT[ch]++;
        }
        for(right=0;right<s.length();right++){
            mapS[s.charAt(right)]++;
            while(contains(mapS,mapT)){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    minstart=left;
                }
                    mapS[s.charAt(left)]--;
                    left++;
            }
        }
        return minlen==Integer.MAX_VALUE?"" : s.substring(minstart,minstart+minlen);
    }
    private boolean contains(int[] mapS,int[] mapT){
        for(int i=0;i<256;i++){
            if(mapT[i]>mapS[i]){
                return false;
            }
        }
        return true;
    }
}