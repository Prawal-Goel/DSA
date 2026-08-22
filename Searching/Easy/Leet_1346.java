class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int start;
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0)
            start=0;
            else start=i+1;
            int end=arr.length-1;
            if(binarySearch(arr,start,end,i)) return true;
            else continue;
        }
        return false;
    }

    private boolean binarySearch(int[]arr,int start,int end,int i){
        while(start<=end){
                int mid =start+(end-start)/2;
                if(arr[mid]==2*arr[i]) return true;
                else if(arr[i]*2<arr[mid]) end=mid-1;
                else start=mid+1;
        }
        return false;
    }
}