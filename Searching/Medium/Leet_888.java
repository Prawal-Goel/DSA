class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
        for (int i=0;i<aliceSizes.length;i++){
            sum1=sum1+aliceSizes[i];
        }
        for (int i=0;i<bobSizes.length;i++){
            sum2=sum2+bobSizes[i];
        }
        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);
        int diff=(sum2-sum1)/2;
        for (int i=0;i<aliceSizes.length;i++){
            int x=aliceSizes[i];
            int target=x+diff;
            int start=0; 
            int end=bobSizes.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(bobSizes[mid]==target){
                    return new int[]{x,target};
                }
                else if(bobSizes[mid]<target) start=mid+1;
                else end=mid-1;
            }
        }
        return new int []{};
    }
}
