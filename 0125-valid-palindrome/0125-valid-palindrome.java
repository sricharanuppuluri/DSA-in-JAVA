class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(!alphanumeric(l)){
                left++;
            }else if(!alphanumeric(r)){
                right--;
            }else{
                if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    private boolean alphanumeric(char c){
        return(c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9');
    }
}