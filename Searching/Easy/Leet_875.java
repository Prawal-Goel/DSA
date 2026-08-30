class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            if(max<piles[i]) max=piles[i];
        }
        int start=1;
        int end=max;
        while (start<end){
            int mid=start+(end-start)/2;
            if(speedTest(piles,mid,h)) end=mid;
            else start=mid+1;
        }
        return end;
    }
    private boolean speedTest(int [] nums,int speed,int h){
        for (int i=0;i<nums.length;i++){
            int hrs=(nums[i]+speed-1)/speed;
            h=h-hrs;
            if(h<0) return false;
        }
        return true;
    }
}
