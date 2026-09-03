class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=weights[0];
        int sum=0;
        for (int i=0;i<weights.length;i++){
            sum=sum+weights[i];
            if(max<weights[i]) 
            max=weights[i];
        }
        int start=max;
        int end=sum;
        if(isShipped(weights,max,days)) return max;
        while (start<end){
            int mid=start+(end-start)/2;
            if(isShipped(weights,mid,days)) end=mid;
            else start=mid+1;
        }
        return end;
    }
    private boolean isShipped(int [] weights,int max,int days){
        int sum=0;
        days--;
        for (int i=0;i<weights.length;i++){
            sum=sum+weights[i];
            if(sum>max){
                sum=weights[i];
                days--;
            }
        }
        return days>=0;
    }
}
