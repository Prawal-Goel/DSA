class Solution {
    public int arrangeCoins(int n) {
        long start=0;
        long end=n;
        while(start<=end){
            long mid=start+(end-start)/2;
            long coin=mid*(mid+1)/2;
            if(n==coin){
                return (int)mid;
            }
            else if(coin<n){
                start=mid+1;
            }
            else end=mid-1;
        }
        return (int) end;
    }
}