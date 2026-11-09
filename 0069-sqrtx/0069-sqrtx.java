class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long left=1;
        long right=x/2;
        while(left<=right){
            long mid=left+(right-left)/2;
            long sqrt=mid*mid;
            if(sqrt==x) return (int)mid;
            if(sqrt<x) left=mid+1;
            if(sqrt>x) right=mid-1;
        }
        return (int)right;
    }
}