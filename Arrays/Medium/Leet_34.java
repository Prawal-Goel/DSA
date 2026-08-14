class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        boolean flag=false;
        if(end==-1||nums[end]<target) 
        return new int[]{-1,-1};
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target) start=mid+1;
            else if(nums[mid]==target) {
                flag=true;
                break;} 
            else end=mid-1;
        }
        if(!flag){
            return new int [] {-1,-1};
        }
        start = 0;
        end = nums.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<=target) start=mid+1;
            else end=mid-1;
        }
        int a=start-1;
        start = 0;
        end = nums.length - 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target) end=mid-1;
            else start=mid+1;
        }
        int b=end+1;
        return new int[] {b,a};
    }
}  
    