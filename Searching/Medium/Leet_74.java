class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rstart=0;
        int rend=matrix.length-1;
        int colmid=matrix[0].length-1;
        while (rend-rstart>1){
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][colmid]==target) return true;
            else if(matrix[mid][colmid]>target)
            rend=mid;
            else rstart=mid;
        }
        if(matrix[rstart][colmid]==target) return true;
        if(matrix[rend][colmid]==target) return true;
        if(binarySearch(matrix[rstart],0,colmid-1,target)) return true;
        if(binarySearch(matrix[rstart],colmid+1,matrix[0].length-1,target)) return true;
        if(binarySearch(matrix[rend],0,colmid-1,target)) return true;
        if(binarySearch(matrix[rend],colmid+1,matrix[0].length-1,target)) return true;
        return false;
    }

    private boolean binarySearch(int [] nums, int start,int end,int target){
        while (start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return false;
    }
}
