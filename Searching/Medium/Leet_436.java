class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[][] arr = new int[intervals.length][2];
        for (int i = 0; i < intervals.length; i++) {
            arr[i][0] = intervals[i][0];
            arr[i][1] = i;   
        }
        for (int i=1;i<intervals.length;i++){
            int j=i;
            while(j>0 && arr[j-1][0]>arr[j][0]){
                int [] temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        int [] ans = new int[intervals.length];
        for (int i=0;i<intervals.length;i++){
            int target=intervals[arr[i][1]][1];
            int start=0;
            int end=intervals.length-1;
            boolean found=false;
            while (start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid][0]){
                    ans[arr[i][1]]=arr[mid][1];
                    found=true;
                    break;
                } 
                else if(target>arr[mid][0]){
                    start=mid+1;
                }
                else end=mid-1;
            }
            if(start==intervals.length){
                ans[arr[i][1]]=-1;
            }
            else if(!found) ans[arr[i][1]]=arr[start][1];
        }
        return ans;
    }
}
